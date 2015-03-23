package com.test;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("AppContext.xml");
	Customer stud=(Customer) context.getBean("mycus");
System.out.println(stud.getName());
Customer stud1=(Customer) context.getBean("mycus");
System.out.println(stud1.getName());

ArrayList list=stud1.getBooks();
Iterator it=list.iterator();
while (it.hasNext()) {
String object = (String) it.next();
System.out.println(object);

}
ArrayList list1=stud1.getPhonenos();
Iterator it1=list1.iterator();
while (it1.hasNext()) {
Contact object = (Contact) it1.next();
System.out.println(object);

}

}
}
