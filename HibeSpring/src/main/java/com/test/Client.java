package com.test;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Tour;
import com.service.TourService;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("springxml.XML");
		Tour tour=(Tour) context.getBean("tour");
		
		tour.setLocation("Mysore");
		tour.setDuration("3d");
		tour.setRate(1388);
		TourService tourService=(TourService) context.getBean("tourServiceImpl");
		tourService.addTour(tour);
		ArrayList<Tour> list=(ArrayList<Tour>) tourService.getTours();
		Iterator<Tour> it=list.iterator();
		while(it.hasNext())
		{
			Tour tour2=it.next();
			System.out.println(tour2);
		}
		
	}

}
