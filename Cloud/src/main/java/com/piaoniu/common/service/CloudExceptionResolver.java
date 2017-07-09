package com.piaoniu.common.service;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Stephen Cai on 2017-07-09 18:43.
 */
public class CloudExceptionResolver implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
		//错误信息
		String message = e.getMessage();
		ModelAndView modelAndView = new ModelAndView();
		//将错误信息传到页面
		modelAndView.addObject("message",message);
		//指向错误页面
		modelAndView.setViewName("error");
		return modelAndView;
	}
}
