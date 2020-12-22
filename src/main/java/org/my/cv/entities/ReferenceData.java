package org.my.cv.entities;

public class ReferenceData {
	private String description;
	private String customer;
	private String role;
	private String company;
	
	
	public ReferenceData(String description, String customer, String role, String company) {
	
		this.description = description;
		this.customer = customer;
		this.role = role;
		this.company = company;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCustomer() {
		return customer;
	}


	public void setCustomer(String customer) {
		this.customer = customer;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	

}
