package com.test;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("AppContext.xml");
		Student stud=(Student) context.getBean("mystud");
System.out.println(stud.getName());
Student stud1=(Student) context.getBean("mystud");
System.out.println(stud1.getName());
System.out.println(stud1.getDepartment());
System.out.println(stud1.getAddress());
ArrayList list=stud1.getBooks();
Iterator it=list.iterator();
 while (it.hasNext()) {
	String object = (String) it.next();
	System.out.println(object);
	
}
	}

}
