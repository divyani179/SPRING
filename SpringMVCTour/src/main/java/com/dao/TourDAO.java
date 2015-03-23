package com.dao;

import java.util.List;

import com.bean.Tour;

public interface TourDAO {
	void addMyTour(Tour tour);

	List<Tour> getMyTourByLoc(String loc);

	List<Tour> getAllMyTours();
}
