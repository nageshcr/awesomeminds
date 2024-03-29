package com.awesomeminds.beans;

public class User implements Cloneable {
	
	
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	private int user_id;

	private String user_name;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + "]";
	}

}
