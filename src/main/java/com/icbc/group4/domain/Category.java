package com.icbc.group4.domain;

import java.io.Serializable;
import java.util.Date;

public class Category implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int categoryId;
	private String couponName; 
	private String couponImage;
	private int maxAmount;
	private Date startTime;
	private Date endTime; 
	private int merchantId;
	private int remainAmount;
	
	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCouponImage() {
		return couponImage;
	}

	public void setCouponImage(String couponImage) {
		this.couponImage = couponImage;
	}

	public int getMaxAmount() {
		return maxAmount;
	}

	public void setMaxAmount(int maxAmount) {
		this.maxAmount = maxAmount;
	}

	public int getRemainAmount() {
		return remainAmount;
	}

	public void setRemainAmount(int remainAmount) {
		this.remainAmount = remainAmount;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

//	public boolean collectAndRecord() {
//		if ( this.checkAmount() && this.checkTime() ) {
//			// 更新 record 数据库
//			return true; 
//		}
//		return true; 
//	}
//	
//	public boolean checkTime() {
//		Date now = new Date(); 
//		if ( now.after(this.startTime) && now.before(this.endTime) ) 
//			return true; 
//		return false; 
//	}
//	public boolean checkAmount() {
//		if (this.remainAmount>0) 
//			return true; 
//		return false; 
//	}

}
