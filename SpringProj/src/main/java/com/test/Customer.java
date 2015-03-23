package com.test;

import java.util.ArrayList;

public class Customer {
String name;
Address address;
ArrayList<String> books;
ArrayList<Contact> phonenos;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public ArrayList<String> getBooks() {
	return books;
}
public void setBooks(ArrayList<String> books) {
	this.books = books;
}
public ArrayList<Contact> getPhonenos() {
	return phonenos;
}
public void setPhonenos(ArrayList<Contact> phonenos) {
	this.phonenos = phonenos;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", address=" + address + ", books="
			+ books + ", phonenos=" + phonenos + "]";
}

}
