package com.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Tour;
@Repository
public class TourDAOImpl implements TourDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addMyTour(Tour tour) {
		String query="insert into Tour(tourid,location,duration,rate) values(tourseq.nextval,?,?,?)";
		Object values[]={tour.getLocation(),tour.getDuration(),tour.getRate()};
		jdbcTemplate.update(query,values);
	}

	@Override
	public List<Tour> getMyTourByLoc(String loc) {
		String query="select * from Tour where location=?";
		Object value[]={loc};
		List<Tour> tourList=jdbcTemplate.query(query,value,new TourMapper());
		return tourList;
	}

	@Override
	public List<Tour> getAllMyTours() {
		String query="select * from Tour";
		List<Tour> tourList=jdbcTemplate.query(query,new TourMapper());
		return tourList;
	}
}
