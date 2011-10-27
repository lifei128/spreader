package com.nali.spreader.workshop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nali.common.util.CollectionUtils;
import com.nali.spreader.constants.Website;
import com.nali.spreader.data.Constellation;
import com.nali.spreader.data.Province;
import com.nali.spreader.data.RobotRegister;
import com.nali.spreader.data.User;
import com.nali.spreader.factory.TaskProduceLine;
import com.nali.spreader.factory.passive.AutowireProductLine;
import com.nali.spreader.factory.passive.PassiveAnalyzer;
import com.nali.spreader.factory.regular.RegularAnalyzer;
import com.nali.spreader.service.IRobotRegisterService;
import com.nali.spreader.util.AvgRandomer;
import com.nali.spreader.util.Randomer;
import com.nali.spreader.util.RangeChoice;
import com.nali.spreader.util.TxtFileUtil;
import com.nali.spreader.util.WeightRandomer;
import com.nali.spreader.words.Txt;

@Component
public class GenerateRobotUserInfo implements RegularAnalyzer, PassiveAnalyzer<Object> {
	private static final String FILE_TOP_FIRST_NAME = "txt/top-first.txt";
	private static final String FILE_PROVINCE = "txt/province.txt";
	private static final String FILE_YEAR = "txt/year.txt";
	private static final String FILE_PINYIN = "txt/py-all.txt";
	private static final String FILE_FIRST_NAME_PINYIN = "txt/py-first.txt";
	private static Logger logger = Logger.getLogger(GenerateRobotUserInfo.class);
	@Value("${GenerateRobotUserInfo.minActiveCount}")
	private int minActiveCount;
	@Autowired
	private IRobotRegisterService robotRegisterService;
	// Randomers
	private Randomer<Integer> genderRandomer;
	private Randomer<List<String>> firstNameRandomer;
	private Randomer<String> maleLastNameRandomer;
	private Randomer<String> maleEnNameRandomer;
	private Randomer<String> femaleLastNameRandomer;
	private Randomer<String> femaleEnNameRandomer;
	private Randomer<Randomer<Integer>> yearRandomer;
	private Randomer<Integer> monthRandomer;
	private Randomer<Integer> dayRandomer;
	private Randomer<Province> provinceRandomer;
	private Randomer<Integer> pwdRandomer;
	
	private RangeChoice<Integer, Constellation> constellations;

	private Map<String, String> firstNamePinyinMap;
	private Map<Character, List<String>> commonPinyinMap;
	
	private Random random=new Random();

	@AutowireProductLine
	private TaskProduceLine<RobotRegister> registerRobotUserEmail;

	public GenerateRobotUserInfo() throws IOException {
		genderRandomer = rangeRandomer(1, 2);
		initFirstNameRandomer();
		maleLastNameRandomer = loadAvgRandomer("txt/boy.txt");
		maleEnNameRandomer = loadKeyAsAvgRandomer("txt/en-boy.txt");
		femaleLastNameRandomer = loadAvgRandomer("txt/girl.txt");
		femaleEnNameRandomer = loadKeyAsAvgRandomer("txt/en-girl.txt");
		initYearRandomer();
		monthRandomer = rangeRandomer(1, 12);
		dayRandomer = rangeRandomer(1, 28);
		initProvinceRandomer();
		pwdRandomer = rangeRandomer(0, 9);

		initFirstNamePinyinMap();
		initCommonPinyinMap();
		
		initConstellation();
	}
	
	private void initCommonPinyinMap() throws IOException {
		Map<String, List<String>> pinyinMap = TxtFileUtil.readKeyListMap(Txt.getUrl(FILE_PINYIN));
		commonPinyinMap = CollectionUtils.newHashMap(pinyinMap.size());
		for (Entry<String, List<String>> entry : pinyinMap.entrySet()) {
			commonPinyinMap.put(entry.getKey().charAt(0), entry.getValue());
		}
	}

	private void initFirstNamePinyinMap() throws IOException {
		firstNamePinyinMap = TxtFileUtil.readKeyValueMap(Txt.getUrl(FILE_FIRST_NAME_PINYIN));
	}

	private Randomer<String> loadAvgRandomer(String path) throws IOException {
		Set<String> datas = TxtFileUtil.read(Txt.getUrl(path));
		return new AvgRandomer<String>(datas);
	}
	
	private Randomer<String> loadKeyAsAvgRandomer(String path) throws IOException {
		Map<String, String> datas = TxtFileUtil.readKeyValueMap(Txt.getUrl(path));
		return new AvgRandomer<String>(datas.keySet());
	}
	
	private Randomer<Integer> rangeRandomer(int start, int end) {
		List<Integer> rlt = new ArrayList<Integer>(end-start+1);
		for (int i = start; i <= end; i++) {
			rlt.add(i);
		}
		return new AvgRandomer<Integer>(rlt);
	}

	private void initFirstNameRandomer() throws IOException {
		WeightRandomer<List<String>> tmpRandomer = new WeightRandomer<List<String>>();
		List<Entry<String, List<String>>> properties = TxtFileUtil.readKeyList(Txt.getUrl(FILE_TOP_FIRST_NAME));
		for (Entry<String, List<String>> entry : properties) {
			String key = entry.getKey();
			List<String> names = entry.getValue();
			Integer count = Integer.valueOf(key);
			tmpRandomer.add(names, count);
		}
		firstNameRandomer=tmpRandomer;
	}
	
	private void initYearRandomer() throws IOException {
		WeightRandomer<Randomer<Integer>> tmpRandomer=new WeightRandomer<Randomer<Integer>>();
		List<Entry<String, List<String>>> properties = TxtFileUtil.readKeyList(Txt.getUrl(FILE_YEAR));
		for (Entry<String, List<String>> entry : properties) {
			Integer weight = Integer.valueOf(entry.getKey());
			List<String> yearStrs = entry.getValue();
			Collection<Integer> years = new ArrayList<Integer>(yearStrs.size());
			for (String yearStr : yearStrs) {
				years.add(Integer.valueOf(yearStr));
			}
			tmpRandomer.add(new AvgRandomer<Integer>(years), weight);
		}
		yearRandomer = tmpRandomer;
	}
	
	private void initProvinceRandomer() throws IOException {
		List<Province> datas = new ArrayList<Province>();
		List<Entry<String, List<String>>> properties = TxtFileUtil.readKeyList(Txt.getUrl(FILE_PROVINCE));
		for (Entry<String, List<String>> entry : properties) {
			String name = entry.getKey();
			List<String> cities = entry.getValue();
			datas.add(new Province(name, new AvgRandomer<String>(cities)));
		}
		provinceRandomer=new AvgRandomer<Province>(datas);
	}

	@Override
	public void work() {
		int accountRegistering = robotRegisterService.countRegisteringAccount(Website.weibo.getId());
		int emailRegistering = robotRegisterService.countNoEmail();
		if (accountRegistering + emailRegistering < minActiveCount) {
			int addCount = (int)(minActiveCount * 1.1) - (accountRegistering + emailRegistering);
			for (int i = 0; i < addCount; i++) {
				generateRobot();
			}
		}
	}

	@Override
	public void work(Object data) {
		generateRobot();
	}
	
	private void generateRobot() {
		RobotRegister robot = createRobot();
		robotRegisterService.save(robot);
		registerRobotUserEmail.send(robot);
	}

	public RobotRegister createRobot() {
		RobotRegister robot = new RobotRegister();
		robot.setFirstName(AvgRandomer.randomItem(firstNameRandomer.get(), random));

		Integer gender = genderRandomer.get();
		robot.setGender(gender);
		if (User.GENDER_MALE.equals(gender)) {
			robot.setLastName(maleLastNameRandomer.get());
			robot.setEnName(maleEnNameRandomer.get());
		} else {
			robot.setLastName(femaleLastNameRandomer.get());
			robot.setEnName(femaleEnNameRandomer.get());
		}
		robot.setFirstNamePinyin(getFirstNamePinyin(robot.getFirstName()));
		robot.setLastNamePinyin(getLastNamePinyin(robot.getLastName()));
		robot.setBirthdayYear(yearRandomer.get().get());
		robot.setBirthdayMonth(monthRandomer.get());
		robot.setBirthdayDay(dayRandomer.get());
		Constellation constellation = getConstellation(robot.getBirthdayMonth(), robot.getBirthdayDay());
		robot.setConstellation(constellation.ordinal());

		Province province = provinceRandomer.get();
		robot.setProvince(province.getName());
		robot.setCity(province.getRandomCity());
		//TODO
		//pwd 6-16
		//nickname 4-20
		//realname=4-16
		
		robot.setPwd(makePwd(robot));

		// robot.setCareer(career);
		// robot.setSchool(school);
		// robot.setIntroduction(introduction);

		 robot.setNickName(robot.getFullName());//temp
		// robot.setEmail(email);
		return robot;
	}

	private String makePwd(RobotRegister robot) {//TODO 长度最好大于9个
		Integer pwdModel = pwdRandomer.get();
		switch (pwdModel) {
		case 1:
			return robot.getFirstNamePinyinLower()+robot.getBirthdayYear();
		case 2:
			return robot.getFirstNamePinyinLower()+robot.getBirthdayFull();
		case 3:
			return robot.getFullNamePinyinLower()+robot.getBirthdayFull();
		case 4:
			return robot.getFullNamePinyinLower()+robot.getBirthdayYear();
		case 5:
			return robot.getEnNameLower()+robot.getBirthdayFull();
		case 6:
			return robot.getEnNameLower()+robot.getBirthdayYear();
		case 7:
			return robot.getEnNameLower()+robot.getFirstNamePinyinLower();
		case 8:
			return robot.getEnName()+robot.getFirstNamePinyin();
		case 9:
			return robot.getLastNamePinyinLower()+(robot.getBirthdayMonth()*100+robot.getBirthdayDay());
		default:
			return robot.getFirstNamePinyin()+robot.getLastNamePinyin();
		}
	}

	private Constellation getConstellation(Integer month, Integer date) {
		return constellations.getCeiling(month * 100 + date);
	}

	private void initConstellation() {
		constellations = new RangeChoice<Integer, Constellation>();
		for (Constellation constellation : Constellation.values()) {
			int month = constellation.getEndMonth();
			int date = constellation.getEndDate();
			constellations.setBorder(month * 100 + date, constellation);
			if (month == 1) {
				constellations.setBorder(12 * 100 + 31, constellation);
			}
		}
	}

	private String getLastNamePinyin(String lastName) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < lastName.length(); i++) {
			char ch = lastName.charAt(i);
			String py = AvgRandomer.randomItem(commonPinyinMap.get(ch), random);
			if (py == null) {
				logger.error("not found pinyin:" + ch);
				continue;
			}
			appendCap(sb, py);
		}
		return sb.toString();
	}

    private static StringBuilder appendCap(StringBuilder sb, String str) {
		return sb.append(Character.toUpperCase(str.charAt(0))).append(str.substring(1));
	}

	private String getFirstNamePinyin(String firstName) {
		String py = firstNamePinyinMap.get(firstName);
		if (py == null) {
			logger.error("not found first name's pinyin:" + firstName);
		}
		return py;
	}

}