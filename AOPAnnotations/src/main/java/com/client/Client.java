package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.performer.Performer;

public class Client {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("springbean.xml");
	Performer single=(Performer) context.getBean("singleband");
	single.perform();
	Performer multi=(Performer) context.getBean("multiband");
	multi.perform();
}
}
