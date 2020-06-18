package com.nnxy.team1;

public class SuJingJie {

	private int id;
	private String name;
	private String school;
	
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
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	@Override
	public String toString() {
		return "SuJingJie [id=" + id + ", name=" + name + ", school=" + school + "]";
	}

}
