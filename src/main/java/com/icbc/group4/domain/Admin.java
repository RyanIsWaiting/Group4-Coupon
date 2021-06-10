package com.icbc.group4.domain;

public class Admin {
	private long adminId;; 
	private String account; 
	private String password; 
	
	public boolean checkInfo(String account, String password) {
		// 数据层； 获取该accout上的密码 
		
		if ( this.account == account && this.password == password ) {
			return true;  
		} 
		else {
			return false; 
		}
	}
}
