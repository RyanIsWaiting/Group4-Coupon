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
		// 需要一个函数 调用数据库，检查name、phone、id是否唯一
		
		if ( true ) {
			return true; 
		} 
		return false; 
	}
	public boolean collect(Category categoryId) {
		//  调用数据层 
		if ( categoryId.collectAndRecord() ) {
			return true; 
		} 
		else {
			return false; 
		}
	}
}
