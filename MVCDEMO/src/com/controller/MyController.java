package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MyController {
	@RequestMapping(value="check")
public String greet(ModelMap map){
	map.addAttribute("mess","using model attribute");
	return "hello";
}
	@RequestMapping("checkdemo")
	public ModelAndView getMessage(){
		String message="welcome to spring using model and view";
		return new ModelAndView("final","myoutput",message);
		
	}
}
