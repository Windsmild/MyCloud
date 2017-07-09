package com.piaoniu.user.dao;

import com.piaoniu.annotations.DaoGen;
import com.piaoniu.common.dao.EntityDao;
import com.piaoniu.user.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Stephen Cai on 2017-07-08 21:50.
 */
@DaoGen(tablePrefix = "")
public interface UserDao extends EntityDao<User> {
	User findByUserName(@Param("userName") String userName);
}
