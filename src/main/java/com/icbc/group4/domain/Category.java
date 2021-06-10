package com.icbc.group4.domain;

import java.util.Date;

public class Category {
	private long categoryId; 
	private long mechantId; 
	private String couponName; 
	private String couponImage; // 存储的存放路径
	private int maxAmount; 
	private int remainAmount; 
	private Date startTime; 
	private Date endTime; 
	private Record[] records; 
	
	
	public long getCategoryId() {
		return this.categoryId;
	}
	

 	public long getMechantId() {
		return mechantId;
	}

	public String getCouponName() {
		return couponName;
	}

	public String getCouponImage() {
		return couponImage;
	}

	public int getRemainAmount() {
		return remainAmount;
	}


	public Date getStartTime() {
		return startTime;
	}

	public Date getEndTime() {
		return endTime;
	}


	public Record[] getRecords() {
		return records;
	}

	
	public boolean collectAndRecord() {
		if ( this.checkAmount() && this.checkTime() ) {
			// 更新 record 数据库
			return true; 
		}
		return true; 
	}
	
	public boolean checkTime() {
		Date now = new Date(); 
		if ( now.after(this.startTime) && now.before(this.endTime) ) 
			return true; 
		return false; 
	}
	public boolean checkAmount() {
		if (this.remainAmount>0) 
			return true; 
		return false; 
	}

}
