package com.icbc.group4.domain;

import java.util.Date;

public class Record {
	private long recordId; 
	private long categoryId; 
	private long userId; 
	private Date collectedTime; 
	
	public Date getCollectedTime() {
		return this.collectedTime;
	}
	public long getCategoryId() {
		return this.categoryId;
	}
	public long getUserId() {
		return this.userId;
	}
}
