package com.piaoniu.user.controller;

import com.piaoniu.user.entity.User;
import com.piaoniu.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Stephen Cai on 2017-07-09 14:59.
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;

//	public ModelAndView handleRequest(HttpServletRequest request,
//									  HttpServletResponse response) throws Exception {
//
//		String userName=request.getParameter("userName");
//		String password = request.getParameter("password");
//		User user = new User();
//		user.setUserName(userName);
//		user.setPassword(password);
//		return new ModelAndView("/welcome.jsp");
//	}

	@RequestMapping(value="/login",method= RequestMethod.POST)
	public String login(User user, HttpServletRequest request) throws Exception {
		userService.login(user);
		return "loginSuccess";
	}

	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String register(User user) throws Exception {
		userService.register(user);
		return "registerSuccess";
	}

}
