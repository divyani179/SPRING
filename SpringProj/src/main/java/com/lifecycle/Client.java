package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.Customer;

public class Client {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("AppContext1.xml"); 
		CustBean stud=(CustBean) context.getBean("custbean");
		System.out.println(stud.getMessage());
       context.registerShutdownHook();

	}

}
