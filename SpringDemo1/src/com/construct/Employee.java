package com.construct;

public class Employee {
String name,department;
int salary;
public Employee(String name) {
	super();
	this.name = name;
}
public Employee(String name, int salary) {
	super();
	this.name = name;
	this.salary = salary;
}
public Employee(String name, String department, int salary) {
	super();
	this.name = name;
	this.department = department;
	this.salary = salary;
}
public Employee(String name, String department) {
	super();
	this.name = name;
	this.department = department;
}

public String getName() {
	return name;
}

public Employee(int salary,String department ) {
	super();
	this.department = department;
	this.salary = salary;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}


}
