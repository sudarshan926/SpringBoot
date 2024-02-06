package com.tech;

public class Student {
	
	private String fname;
	private String lname;
	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + "]";
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	

}
