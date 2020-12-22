package org.my.cv.entities;

public class EducationData {
	
	private String year;
	private String course;
	private String college;
	private String description;
	
	public EducationData(String year, String course, String college, String description) {
		this.year = year;
		this.course = course;
		this.college = college;
		this.description = description;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	

}
