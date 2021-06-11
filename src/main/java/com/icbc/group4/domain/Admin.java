package com.icbc.group4.domain;

import java.io.Serializable;

public class Admin implements Serializable  {
	
	private static final long serialVersionUID = -1205226416664488559L;
	
	private Integer id;
	private String account;
	private String password;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
