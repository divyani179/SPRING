package com.test;

public class Book {
String title,author;

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

@Override
public String toString() {
	return "Book [title=" + title + ", author=" + author + "]";
}

}
