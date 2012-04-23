package com.nali.spreader.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import com.nali.spreader.util.random.RandomUtil;

public abstract class MemoryRandomDataIterator<T, E> extends DataIterator<E>{
	private List<T> randomIds;
	
	public MemoryRandomDataIterator (long upperCount, int batchSize, List<T> ids, Set<T>  excludeIds) {
		super(0, batchSize);
		
		
		Set<T> diffSet = CollectionUtils.diffset(ids, excludeIds);
		int tempCount = ids.size() - diffSet.size();
		if(tempCount <= upperCount || upperCount < 0) {
			this.count = tempCount;
			Collections.shuffle(new ArrayList<T>(diffSet));
		}else{
			this.count = upperCount;
			ids = RandomUtil.randomItemsUnmodify(ids, excludeIds, (int)upperCount);
		}
		this.randomIds = ids;
	}
	
	public List<T> getAll() {
		return this.randomIds;
	}
	
	protected abstract List<E> queryByIds(List<T> ids);
	
	@Override
	public List<E> query(long offset, int limit) {
		List<T> rtnIds = this.randomIds.subList((int)offset, (int)(offset + limit));
	    return this.queryByIds(rtnIds);
	}
}
