package com.fdm.serializer;

import java.io.Serializable;



public class User implements Serializable {
	
	private static final long serialVersionUID = 1;
	
	private String username;
	private transient String confirmpassword;
	private String password;
	private Share share;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Share getShare() {
		return share;
	}
	public void setShare(Share share) {
		this.share = share;
	}
	 
	

}
