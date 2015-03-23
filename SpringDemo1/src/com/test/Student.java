package com.test;

public class Student {
String name;
String department;
Address address;

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getName() {
	return name;
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
@Override
public String toString() {
	return "Student [name=" + name + ", department=" + department
			+ ", address=" + address + "]";
}


}
