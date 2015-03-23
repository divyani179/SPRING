package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Category {
String name ;

Items item;
public String getName() {
	return name;
}
@Value("rajat")
public void setName(String name) {
	this.name = name;
}
public Items getItem() {
	return item;
}
@Autowired
@Qualifier(value="eItem")
public void setItem(Items item) {
	this.item = item;
}
@Override
public String toString() {
	return "Category [name=" + name + ", item=" + item + "]";
}


}
