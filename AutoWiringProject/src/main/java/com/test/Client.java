package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("AppContext.xml");
		ShapeFactory stud=(ShapeFactory) context.getBean("SF2");
		System.out.println(stud.getMyArea(3, 4));
		ShapeFactory stud1=(ShapeFactory) context.getBean("SF1");
		System.out.println(stud1.getMyArea(3, 4));
	}

}
