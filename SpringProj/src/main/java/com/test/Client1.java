package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("AppContext1.xml");
		Book book=(Book) context.getBean("mybook");
		System.out.println("Book:"+book.getTitle());
		Book book1=(Book) context.getBean("mybook");
		System.out.println("Book:"+book1.getTitle());
		book1.setTitle("Spring in action");
		System.out.println("book1 is modified as :"+book1.getTitle());
		System.out.println("book is modified as :"+book.getTitle());
		
	}

}
