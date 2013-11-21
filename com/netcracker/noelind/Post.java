package com.netcracker.klenin.noelind;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Post {
	private String text;
	private Photo photo;
	private User author;
	private Calendar date;
	
	private Post() {} 
	
	public Post(String text, User user) {
		setText(text);
		setAuthor(user);
		date = new GregorianCalendar();
	}
	
	public Post(String text, User user, Photo photo) {
		this(text, user);
		setPhoto(photo);
	}
	
	public void setText(String text) {
		this.text = text;
	}
	public void setAuthor(User user) {
		this.author = user;
	}
	public void setPhoto(Photo photo) {
		this.photo = photo;
	}
}
