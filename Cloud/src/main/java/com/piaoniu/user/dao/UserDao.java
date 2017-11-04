package com.piaoniu.user.dao;

import com.piaoniu.annotations.DaoGen;
import com.piaoniu.common.dao.EntityDao;
import com.piaoniu.user.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * Created by Stephen Cai on 2017-07-08 21:50.
 */
@Component
@DaoGen(tablePrefix = "")
public interface UserDao extends EntityDao<User> {
	User findByUserName(@Param("userName") String userName);
}
