package com.webapp.concretedetailer.payload;

import java.util.List;

import com.webapp.concretedetailer.models.Role;

public class UserInfoResponse {
	
	 private Long id;
	 private String username;
	 private String email;
	 private List<String> roles ;
	 
	
	public UserInfoResponse(Long id, String username, String email, List<String> roles) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
	
	
}
