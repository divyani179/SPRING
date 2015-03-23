package com.service;

import java.util.List;

import com.bean.Tour;

public interface TourService {
	void addTour(Tour tour);

	List<Tour> getTourByLoc(String loc);

	List<Tour> getAllTours();
}
