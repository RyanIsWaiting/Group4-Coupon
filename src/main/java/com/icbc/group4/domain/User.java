package com.icbc.group4.domain;

import java.io.Serializable;

public class User implements Serializable {
	private long userId; 
	private String userName; 
	private String phoneNumber; 
	private String identityNumber;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	} 
	
	
//	public boolean checkInfo( String userName, String phoneNumber, String identityNumber) {
//		// ��Ҫһ������ �������ݿ⣬���name��phone��id�Ƿ�Ψһ
//		
//		if ( true ) {
//			return true; 
//		} 
//		return false; 
//	}
//	public boolean collect(Category categoryId) {
//		//  �������ݲ� 
//		if ( categoryId.collectAndRecord() ) {
//			return true; 
//		} 
//		else {
//			return false; 
//		}
//	}
}
