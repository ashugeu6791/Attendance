package com.attendance.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class HelloController {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		ModelAndView model = new ModelAndView("hello");
		model.addObject("message","Hello I am good");
		return model;
		
	}
}