package com.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eItem")
public class EItem extends Items{
	public String getName() {
		return name;
	}
	@Value("divyani")
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	@Value("2345")
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Items [name=" + name + ", price=" + price + "]";
	}


}
