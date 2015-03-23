package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.bean.Employee;

@Controller
public class EmpController {

	
	
	@RequestMapping("addEmployee")
	public String showForm(){
		return "addEmployee";
	}
	@RequestMapping(value="add" , method=RequestMethod.POST)
	public String processForm(@RequestParam(value="myname",required=true) String name ,@ModelAttribute("emp") Employee e,BindingResult result ,ModelMap model){
		e.setName(name);
		System.out.println(e);
		if(result.hasErrors()){
			return "addEmployee";
		}
		model.addAttribute("myemployee",e);
		return "success";
		
	}
}
