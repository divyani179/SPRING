package com.test;

public class Contact {
int phoneno;
String phonetype;
public int getPhoneno() {
	return phoneno;
}
public void setPhoneno(int phoneno) {
	this.phoneno = phoneno;
}
public String getPhonetype() {
	return phonetype;
}
public void setPhonetype(String phonetype) {
	this.phonetype = phonetype;
}
@Override
public String toString() {
	return "Contact [phoneno=" + phoneno + ", phonetype=" + phonetype + "]";
}

}
