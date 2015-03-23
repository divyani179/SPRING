package com.bean;

import org.springframework.stereotype.Component;

@Component
public class Tour {
	//int tourId;
	String location,duration;
	int rate;
	
	
	/*public int getTourId() {
		return tourId;
	}
	public void setTourId(int tourId) {
		this.tourId = tourId;
	}*/
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Tour [location=" + location + ", duration=" + duration
				+ ", rate=" + rate + "]";
	}
	
}
