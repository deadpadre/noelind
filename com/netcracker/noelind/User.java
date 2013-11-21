package com.netcracker.klenin.noelind;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class User {
	protected boolean sex;
	protected String name, town;
	protected Calendar birthdate;
	protected List <Post> listOfPosts = new ArrayList <Post>();
	
	
	boolean hasBirthdate() {
		return (birthdate != null);
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
	public Calendar getBirthdate() {
		return birthdate;
	}
	void setBirthdate(Calendar birthdate) {
		this.birthdate = birthdate;
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
