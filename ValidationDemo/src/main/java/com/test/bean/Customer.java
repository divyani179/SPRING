package com.test.bean;

public class Customer {
String name;
String city;
int age;
int cust_id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public int getCust_id() {
	return cust_id;
}
public void setCust_id(int cust_id) {
	this.cust_id = cust_id;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", city=" + city + ", age=" + age
			+ ", cust_id=" + cust_id + "]";
}

}
