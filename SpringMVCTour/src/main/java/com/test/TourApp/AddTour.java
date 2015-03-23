package com.test.TourApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Tour;
import com.service.TourService;
import com.service.TourServiceImpl;

@Controller
public class AddTour {
	@RequestMapping(value="addTour")
	public String showForm(){
		return "addTour";
	}
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String processForm(@ModelAttribute("tour")Tour t,BindingResult result,ModelMap model){
		System.out.println(t);
		ApplicationContext context=new ClassPathXmlApplicationContext("springjdbc.xml");
		TourService tourService=(TourService) context.getBean("tourServiceImpl");
		tourService.addTour(t);
		if(result.hasErrors()){
			return "addTour";
		}
		model.addAttribute("mytour",t);
		return "success";
	}
}
