package org.my.cv.entities;

public class WorkExperienceData {
	
	private String duration;
	private String description;
	private String company;
	private String role;
	
	
	public WorkExperienceData(String duration, String description, String company, String role) {
		this.duration = duration;
		this.description = description;
		this.company = company;
		this.role = role;
	}
	
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
