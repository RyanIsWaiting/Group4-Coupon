package com.icbc.group4.domain;

import java.io.Serializable;

public class Merchant implements Serializable {
	private long merchantId; 
	private long merchantName; 
	private Category[] categories; 
	
	public void addCategory(Category category) {
		// 目前不用写
	}
	
	public Category[] getCategory() {
		// 链接数据库 查询 该商户的category 
		return this.categories;
	}
	
}
