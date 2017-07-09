package com.piaoniu.user.controller;

import com.piaoniu.user.entity.User;
import com.piaoniu.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Stephen Cai on 2017-07-09 14:59.
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;

	public ModelAndView handleRequest(HttpServletRequest request,
									  HttpServletResponse response) throws Exception {

		String userName=request.getParameter("userName");
		String password = request.getParameter("password");
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		return new ModelAndView("/welcome.jsp");
	}
}
