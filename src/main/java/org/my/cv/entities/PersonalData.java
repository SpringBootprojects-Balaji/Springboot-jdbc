package org.my.cv.entities;

public class PersonalData {
	int id;
	String name;
	String desc;
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
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", desc=" + desc + "\n";
	}
	
	
	
	
	

}
