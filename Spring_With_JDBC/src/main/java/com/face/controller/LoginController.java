package com.face.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.face.model.Login;
import com.face.model.User;
import com.face.service.UserService;


@Controller
public class LoginController {
	@Autowired
 public UserService userService;
	@RequestMapping(value="/home" ,method=RequestMethod.GET)
		public ModelAndView showing() {
		ModelAndView mav=new ModelAndView("home");
		return mav;
			
		}
	@RequestMapping("login")
	public ModelAndView login() {
		System.out.println("welcome login");
		ModelAndView mv=new ModelAndView("login");
		return mv;
		
	}
	
	@RequestMapping(value="loginprocess",method=RequestMethod.GET)
	
	public ModelAndView loginprocess(HttpServletRequest request, HttpServletResponse response,Login loginn)
	{ModelAndView mav=null;
	User user=userService.validateUser(loginn);
	if(null != user) {
		mav=new ModelAndView("welcome");
		mav.addObject("Firstname",user.getFirstname());
		
	}
	else {
		mav=new ModelAndView("login");
		mav.addObject("message","Username or password is wrong!!");
	}
	return mav;
	
}
}