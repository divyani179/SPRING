package com.test.validation;

import javax.validation.Valid;

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

	
	
	@RequestMapping(value="/addemployee", method=RequestMethod.GET)
	public String showForm(ModelMap model){
		Employee e=new Employee();
		model.addAttribute("employee",e);
		
		return "addEmployee";
	}
	@RequestMapping(value="add" , method=RequestMethod.POST)
	public String processForm(@ModelAttribute("employee") @Valid Employee e,BindingResult result ,ModelMap model){
	
		if(result.hasErrors()){
			return "addEmployee";
		}
		model.addAttribute("model",e);
		return "success";
		
	}
}
