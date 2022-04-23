package com.greatlearning.employee;

public class employee {

	public String firstName;
	public String lastName;
	String email;
	public String company;
	public String department;

	public String setFirstName() {
		return firstName;

	}

	public String setlastName() {
		return lastName;

	}

	public void setdepartment(String department) {
		this.department = department;

	}

	public String getdepartment() {
		return this.department;
	}

	public void setcompany(String company) {
		this.company = company;

	}

	public String getcompany() {
		return this.company;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		company = "prudance";

	}
}