package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Tour {
String location;
String duration;
int rate;
@Column(name="TOURID")
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="tourseq")
@SequenceGenerator(name="tourseq",sequenceName="toursequence")
@Id
int tourid;
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
public int getTourid() {
	return tourid;
}
public void setTourid(int tourid) {
	this.tourid = tourid;
}
@Override
public String toString() {
	return "Tour [location=" + location + ", duration=" + duration + ", rate="
			+ rate + ", tourid=" + tourid + "]";
}

}
