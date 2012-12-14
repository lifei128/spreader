package com.nali.spreader.analyzer.ximalaya;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nali.common.util.CollectionUtils;
import com.nali.spreader.constants.Website;
import com.nali.spreader.data.User;
import com.nali.spreader.factory.TaskProduceLine;
import com.nali.spreader.factory.config.Configable;
import com.nali.spreader.factory.config.desc.ClassDescription;
import com.nali.spreader.factory.config.desc.PropertyDescription;
import com.nali.spreader.factory.passive.AutowireProductLine;
import com.nali.spreader.factory.regular.RegularAnalyzer;
import com.nali.spreader.group.config.UserGroupExtendedBeanImpl;
import com.nali.spreader.service.IGlobalUserService;
import com.nali.spreader.service.IUserGroupFacadeService;
import com.nali.spreader.util.avg.Average;
import com.nali.spreader.util.avg.AverageHelper;
import com.nali.spreader.util.avg.ItemCount;
import com.nali.spreader.util.random.RandomUtil;
import com.nali.spreader.workshop.other.AddUserFans;
import com.nali.spreader.workshop.ximalaya.AddXimalayaFans.AddXimalayaWorkDto;

@Component
@ClassDescription("喜马拉雅·关注用户(加粉)")
public class AddFansToXimalaya extends UserGroupExtendedBeanImpl implements RegularAnalyzer,
		Configable<AddFansToXimalaya.AddFansToXimalayaConfig> {
	private Integer addLimit;
	private Integer execuAddLimit;
	private Long attentionLimit;
	private Long fansLimit;
	private Integer execuInterval;
	@Autowired
	private IGlobalUserService globalUserService;
	@Autowired
	private IUserGroupFacadeService userGroupFacadeService;
	@AutowireProductLine
	private TaskProduceLine<AddXimalayaWorkDto> addXimalayaFans;

	public AddFansToXimalaya() {
		super("分组${fromGroup}关注${toGroup}");
	}

	@Override
	public String work() {
		Long fromGid = getFromUserGroup();
		Long toGid = getToUserGroup();
		List<Long> fromUids = globalUserService.getAttenLimitUids(Website.ximalaya.getId(),
				userGroupFacadeService.getUids(fromGid), attentionLimit);
		List<Long> toUids = globalUserService.getAttenLimitUids(Website.ximalaya.getId(),
				userGroupFacadeService.getUids(toGid), fansLimit);
		Integer toAddUserCount = toUids.size();
		List<ItemCount<Long>> execuData = AverageHelper.getItemCounts(execuAddLimit, fromUids);
		Average<Long> avg = AverageHelper.selectAverageByParam(toAddUserCount, fromUids.size(),
				addLimit, execuAddLimit, execuData);
		Date addTime = new Date();
		Set<Long> addExists = new HashSet<Long>();
		while (avg.hasNext()) {
			List<ItemCount<Long>> items = avg.next();
			List<Long> workData = RandomUtil.randomItems(toUids, addExists, 1);
			if (!CollectionUtils.isEmpty(workData)) {
				Long toUid = workData.get(0);
				User u = globalUserService.getUserById(toUid);
				long fans = u.getFans();
				for (ItemCount<Long> item : items) {
					Long fromUid = item.getItem();
					int count = item.getCount();
					if (fans <= fansLimit) {
						if (count > 0) {
							addFans(fromUid, toUid, addTime);
							addTime = DateUtils.addMinutes(addTime, execuInterval);
							fans++;
						}
					} else {
						break;
					}
				}
				addExists.add(toUid);
			}
		}
		return null;
	}

	/**
	 * 机器人执行加粉的操作
	 * 
	 * @param robotId
	 * @param uid
	 */
	private void addFans(Long fromUid, Long toUid, Date addStartTime) {
		AddXimalayaWorkDto dto = new AddXimalayaWorkDto();
		dto.setFromUid(fromUid);
		dto.setToUid(toUid);
		dto.setStartTime(addStartTime);
		addXimalayaFans.send(dto);
	}

	@Override
	public void init(AddFansToXimalayaConfig config) {
		execuInterval = config.getExecuInterval();
		attentionLimit = config.getAttentionLimit();
		fansLimit = config.getFansLimit();
		if (execuInterval == null || execuInterval <= 0) {
			execuInterval = AddUserFans.AddFansDto.DEFAULT_ADD_FANS_INTERVAL;
		}
		addLimit = config.getAddCount();
		if (addLimit == null) {
			addLimit = 1;
		}
		execuAddLimit = config.getExecuAddCount();
		if (execuAddLimit == null) {
			execuAddLimit = 1;
		}
	}

	public static class AddFansToXimalayaConfig implements Serializable {
		private static final long serialVersionUID = 8861711636679339664L;
		@PropertyDescription("机器人执行关注的间隔时间(分钟)")
		private Integer execuInterval;
		@PropertyDescription("机器人已关注的次数上限(超过此上限该机器人不再分派任务)")
		private Long attentionLimit;
		@PropertyDescription("被关注人的粉丝数上限(超过此上限该用户不再添加粉丝,不填则不受限)")
		private Long fansLimit;
		@PropertyDescription("微博作者被关注的次数上限(单次)")
		private Integer addCount;
		@PropertyDescription("机器人执行关注的次数上限(单次)")
		private Integer execuAddCount;

		public Integer getExecuInterval() {
			return execuInterval;
		}

		public void setExecuInterval(Integer execuInterval) {
			this.execuInterval = execuInterval;
		}

		public Long getAttentionLimit() {
			return attentionLimit;
		}

		public void setAttentionLimit(Long attentionLimit) {
			this.attentionLimit = attentionLimit;
		}

		public Long getFansLimit() {
			return fansLimit;
		}

		public void setFansLimit(Long fansLimit) {
			this.fansLimit = fansLimit;
		}

		public Integer getAddCount() {
			return addCount;
		}

		public void setAddCount(Integer addCount) {
			this.addCount = addCount;
		}

		public Integer getExecuAddCount() {
			return execuAddCount;
		}

		public void setExecuAddCount(Integer execuAddCount) {
			this.execuAddCount = execuAddCount;
		}
	}
}