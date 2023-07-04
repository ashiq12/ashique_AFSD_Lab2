package com.gl.model;

public class Employee {

	public Employee(String f_Name,String l_Name) {	
		this.f_Name =f_Name;
		this.l_Name= l_Name; 
	}
	
	private String f_Name;
	private String l_Name;
	private String email;
	private String password;
	public String getF_Name() {
		return f_Name;
	}
	public void setF_Name(String f_Name) {
		this.f_Name = f_Name;
	}
	public String getL_Name() {
		return l_Name;
	}
	public void setL_Name(String l_Name) {
		this.l_Name = l_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
