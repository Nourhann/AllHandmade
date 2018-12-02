package com.AllHandmade.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "admins")
public class Admin {

    public String username;
    public String Password;
    public String type;
    public String email;
    
	public Admin() {
		super();
	}
	public Admin(String id, String name, String password, String type, String email) {
		super();
		this.username = name;
		this.Password = password;
		this.type = type;
		this.email = email;
	}
	
	public String getusername() {
		return username;
	}
	public void setusername(String name) {
		username = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    
}
