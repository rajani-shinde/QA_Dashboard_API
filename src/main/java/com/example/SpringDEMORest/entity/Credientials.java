package com.example.SpringDEMORest.entity;

public class Credientials {
	
	private String user_name;
	private String password;
	public Credientials(String user_name, String password) {
		super();
		this.user_name = user_name;
		this.password = password;
	}
	public Credientials() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Credientials [user_name=" + user_name + ", password=" + password + ", getUser_name()=" + getUser_name()
				+ ", getPassword()=" + getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

	
	

}
