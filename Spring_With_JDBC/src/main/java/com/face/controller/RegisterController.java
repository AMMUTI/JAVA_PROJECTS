package com.face.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.face.model.User;
import com.face.service.UserService;

@Controller
public class RegisterController {
	@Autowired
	public UserService userService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		System.out.println("Welcome to home controller");
		ModelAndView mv=new ModelAndView("home");
		return mv;
	}
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView register() {
		ModelAndView mv=new ModelAndView("register");
		return mv;
		
	}
	@RequestMapping(value = "/registerprocess",method=RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request,HttpServletResponse response,User user) 
	{System.out.println(user.getFirstname());
		userService.register(user);
		return new ModelAndView("welcome","Firstname",user.getFirstname());
		
		
	}
	

}
