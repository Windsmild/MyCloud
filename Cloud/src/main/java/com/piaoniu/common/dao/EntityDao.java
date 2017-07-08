package com.piaoniu.common.dao;

import com.piaoniu.common.entity.Entity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.Collection;
import java.util.List;

/**
 * Created by Stephen Cai on 2017-07-08 21:44.
 */
public interface EntityDao<T extends Entity> {

	int insert(T t);
	T findById(int id);
	int update(T t);
	List<T> queryInIds(@Param("ids")Collection<Integer> ids);

	List<T> queryAll(RowBounds rowBounds);

	int batchInsert(List<T> items);

}

