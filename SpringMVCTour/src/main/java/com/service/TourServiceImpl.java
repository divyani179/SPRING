package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bean.Tour;
import com.dao.TourDAO;
@Service
public class TourServiceImpl implements TourService {
	@Autowired
	@Qualifier("tourDAOImpl")
	TourDAO tourDAO;
	
	public TourDAO getTourDAO() {
		return tourDAO;
	}

	public void setTourDAO(TourDAO tourDAO) {
		this.tourDAO = tourDAO;
	}

	@Override
	public void addTour(Tour tour) {
		tourDAO.addMyTour(tour);
	}

	@Override
	public List getTourByLoc(String loc) {
		List<Tour> tourList=tourDAO.getMyTourByLoc(loc);
		return tourList;
	}

	@Override
	public List getAllTours() {
		List<Tour> allTours=tourDAO.getAllMyTours();
		return allTours;
	}

}
