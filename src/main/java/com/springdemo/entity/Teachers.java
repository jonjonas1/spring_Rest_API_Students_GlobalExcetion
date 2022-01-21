package com.springdemo.entity;

public class Teachers {
	
	private String firstName;
	private String lastname;
	
	public Teachers() {
		
	}
	
	public Teachers(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastname = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	

}
