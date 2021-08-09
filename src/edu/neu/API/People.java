package edu.neu.API;

public class People {

	private String name;
	private String position;
	private int id;
	private String dob;
		
	public People(String name, String position, int id, String dob) {
		super();
		this.name = name;
		this.position = position;
		this.id = id;
		this.dob = dob;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
