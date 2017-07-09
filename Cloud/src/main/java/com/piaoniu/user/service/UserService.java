package com.piaoniu.user.service;

import com.piaoniu.user.dao.UserDao;
import com.piaoniu.user.entity.User;
import com.piaoniu.user.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Stephen Cai on 2017-07-08 21:58.
 */

@Service
public class UserService {
	@Autowired
	UserDao userDao;

	public String register(User user) throws Exception {
		User existedUser = userDao.findByUserName(user.getUserName());
		if (existedUser != null) {
			throw  new Exception("用户已经被注册");
		} else if (user.getPassword() == null || user.getPassword().isEmpty()){
			throw  new Exception("密码为空");
		} else {
			user.setPassword(UserUtils.pwdWithSalt(user.getPassword()));
			userDao.insert(user);
		}
		return "注册成功";
	}

	public String login(User user) throws Exception {
		User existedUser = userDao.findByUserName(user.getUserName());
		if (existedUser == null) {
			throw  new Exception("用户不存在");
		} else if (user.getPassword() == null || user.getPassword().isEmpty()){
			throw  new Exception("密码为空");
		} else if (! existedUser.getPassword().equals(UserUtils.pwdWithSalt(user.getPassword()))) {
			throw  new  Exception("密码错误");
		}
		return "登录成功";
	}
}
