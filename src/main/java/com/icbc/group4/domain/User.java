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
//		// 需要一个函数 调用数据库，检查name、phone、id是否唯一
//		
//		if ( true ) {
//			return true; 
//		} 
//		return false; 
//	}
//	public boolean collect(Category categoryId) {
//		//  调用数据层 
//		if ( categoryId.collectAndRecord() ) {
//			return true; 
//		} 
//		else {
//			return false; 
//		}
//	}
}
