package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("itemsconfig.xml");
		Category category= (Category) context.getBean("category");
		System.out.println(category);
	}

}
