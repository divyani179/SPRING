package com.test.validation;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.bean.Customer;
@Controller
public class CustController {
	//@Autowired
	@Qualifier("customerValidator")
	private Validator validator;
	@InitBinder
	private void InitBinder(WebDataBinder binder){
		binder.setValidator(validator);
		
	}
	@RequestMapping(value="/addcustomer", method=RequestMethod.GET)
	public String showForm(ModelMap model){
		Customer c=new Customer();
		model.addAttribute("cust",c);
		
		return "addCustomer";
	}
	@RequestMapping(value="add" , method=RequestMethod.POST)
	public String processForm(@ModelAttribute("customer") @Valid Customer e,BindingResult result ,ModelMap model){
	
		if(result.hasErrors()){
			return "addCustomer";
		}
		model.addAttribute("model",e);
		return "custsuccess";
		
	}
}
