package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bean.Tour;



public class TourMapper implements RowMapper<Tour> {

	@Override
	public Tour mapRow(ResultSet res, int arg1) throws SQLException {
		Tour tour=new Tour();
	//	tour.setTourId(res.getInt("tourid"));
		tour.setLocation(res.getString("location"));
		tour.setDuration(res.getString("duration"));
		tour.setRate(res.getInt("rate"));
		return tour;
	}
}
