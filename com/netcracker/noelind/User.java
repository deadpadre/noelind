package com.netcracker.noelind;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class User {
	protected boolean sex;
	protected String name, town;
	protected Calendar birthday;
	protected List <Post> listOfPosts = new ArrayList <Post>();
	
	
	boolean hasBirthdate() {
		return (birthday != null);
	}
	public String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	public String getTown() {
		return town;
	}
	void setTown(String town) {
		this.town = town;
	}
	public Calendar getBirthday() {
		return birthday;
	}
	void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}
	public boolean getSex() {
		return sex;
	}
	void setSex(boolean sex) {
		this.sex = sex;
	}
	private User() {}
	public User(String name) {
		setName(name);
	}
	public void writePost(String text) {
		listOfPosts.add(new Post(text, this));
	}
	public void writePost(String text, Photo photo) {
		listOfPosts.add(new Post(text, this, photo)); 
	}
}
