package org.my.cv.entities;

import java.util.Date;

public class PersonalData {
	int id;
	String name;
	String desc;
	Date dob;
	int housenumber;
	String street;
	String city;
	String country;
	String email;
	String phone;
	String countrycode;
	
	
	public PersonalData() {
		
	}

	
	public PersonalData(int id, String name, String desc, Date dob, int housenumber, String street, String city,
			String country, String email, String phone, String countrycode) {
		
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.dob = dob;
		this.housenumber = housenumber;
		this.street = street;
		this.city = city;
		this.country = country;
		this.email = email;
		this.phone = phone;
		this.countrycode = countrycode;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	public Date getDob() {
		return dob;
	}


	public int getHousenumber() {
		return housenumber;
	}


	public String getStreet() {
		return street;
	}


	public String getCity() {
		return city;
	}


	public String getCountry() {
		return country;
	}


	public String getEmail() {
		return email;
	}


	public String getPhone() {
		return phone;
	}


	public String getCountrycode() {
		return countrycode;
	}


	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", desc=" + desc + "\n";
	}
	
	
	
	
	

}
