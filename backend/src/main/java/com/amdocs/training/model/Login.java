package com.amdocs.training.model;

public class Login {
	private int id;
	private String pass;
	
	public Login() {
		
	}
	public Login(int id, String pass) {
		super();
		this.id = id;
		this.pass = pass;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
