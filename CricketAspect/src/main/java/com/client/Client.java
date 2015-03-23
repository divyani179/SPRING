package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.match.Match;



public class Client {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("cricketbean.xml");
	Match single=(Match) context.getBean("match");
	single.play1stInning();
	single.play2ndInning();
	
}
}
