package com.icbc.group4.domain;

public class Admin {
	private long adminId;; 
	private String account; 
	private String password; 
	
	public boolean checkInfo(String account, String password) {
		// ���ݲ㣻 ��ȡ��accout�ϵ����� 
		
		if ( this.account == account && this.password == password ) {
			return true;  
		} 
		else {
			return false; 
		}
	}
}
