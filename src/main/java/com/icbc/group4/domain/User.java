package com.icbc.group4.domain;

public class User {
	private long userId; 
	private String userName; 
	private String phoneNumber; 
	private String identityNumber; 
	
	public long getUserId() {
		return this.userId;
	}
	public String getUserName() {
		return this.userName;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public String getIdentityNumber() {
		return this.identityNumber;
	}
	public boolean checkInfo( String userName, String phoneNumber, String identityNumber) {
		// ��Ҫһ������ �������ݿ⣬���name��phone��id�Ƿ�Ψһ
		
		if ( true ) {
			return true; 
		} 
		return false; 
	}
	public boolean collect(Category categoryId) {
		//  �������ݲ� 
		if ( categoryId.collectAndRecord() ) {
			return true; 
		} 
		else {
			return false; 
		}
	}
}
