package com.test.bean;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Email;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@NotNull @Size(min=5,max=15)
String name;
	@NotNull
String city;
	@Min(21) @Max(68)
int age;
int salary;
@Email
String email;
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", city=" + city + ", age=" + age
			+ ", salary=" + salary + ", email=" + email + "]";
}

}
