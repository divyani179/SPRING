package com.test.bean;

public class Employee {

	String name,city;
	int salary;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", salary="
				+ salary + "]";
	}
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
