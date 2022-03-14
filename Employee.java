package com.gl.model;

public class Employee {
	
	private String firstName;
	private String secondName;
	private String department;
	
	public Employee() {
	}
	
	public Employee(String firstName, String secondName) {
		this.firstName = firstName;
		this.secondName = secondName;		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getDepartment() {
		return department;
	}


public void setDepartment(String department) {
		this.department = department;		
	}

	
	

}
