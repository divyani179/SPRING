package com.dao;

import java.util.List;

import com.bean.Tour;

public interface TourDAO {
	public abstract void  addMyTour(Tour t);
	public abstract List<Tour> getMyTourByLocation(String city);
	public abstract List<Tour> getAllTours();

}
