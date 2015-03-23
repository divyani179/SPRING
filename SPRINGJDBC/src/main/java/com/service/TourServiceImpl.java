package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bean.Tour;
import com.dao.TourDAO;
@Service
public class TourServiceImpl implements TourService{
     @Autowired
     @Qualifier("tourDaoImpl")
	TourDAO tourDAO;
     
	public TourDAO getTourDAO() {
		return tourDAO;
	}

	public void setTourDAO(TourDAO tourDAO) {
		this.tourDAO = tourDAO;
	}

	@Override
	public void addTour(Tour tour) {
		// TODO Auto-generated method stub
		System.out.println("adding tour packages in service layer");
		tourDAO.addMyTour(tour);
	}

	@Override
	public List<Tour> getTourByLocation(String city) {
		// TODO Auto-generated method stub
		System.out.println("getting from service layer");
		List<Tour> tourlist=tourDAO.getMyTourByLocation(city);
		return tourlist;
		
	}

	@Override
	public List<Tour> getTours() {
		// TODO Auto-generated method stub
		System.out.println("getting from service layer");
		List<Tour> tourlist=tourDAO.getAllTours();
		return tourlist;
	}

	
}
