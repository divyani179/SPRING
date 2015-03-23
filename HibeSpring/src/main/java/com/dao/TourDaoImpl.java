package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Tour;
@Repository
public abstract class TourDaoImpl implements TourDAO {
	@Autowired
	HibernateTemplate template;


	@Override
	public List<Tour> getMyTourByLocation(String city) {
		// TODO Auto-generated method stub
		System.out.println("getting packages by city [DAO]");
		String query="from Tour t where t.location like:?";
		List<Tour> tlist=template.find(query,city);
		return tlist;
	
	}

	@Override
	public List<Tour> getAllTours() {
		// TODO Auto-generated method stub
		System.out.println("getting all packages[DAO]");
		return ((List<Tour>) template.find("from Tour t"));
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Override
	public void addMyTour(Tour tour) {
		// TODO Auto-generated method stub
		System.out.println("adding tours[DAO layer]");
		template.save(tour);
	}
	

}
