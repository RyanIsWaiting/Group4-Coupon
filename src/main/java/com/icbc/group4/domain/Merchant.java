package com.icbc.group4.domain;

import java.io.Serializable;

public class Merchant implements Serializable {
	private long merchantId; 
	private long merchantName; 
	private Category[] categories; 
	
	public void addCategory(Category category) {
		// Ŀǰ����д
	}
	
	public Category[] getCategory() {
		// �������ݿ� ��ѯ ���̻���category 
		return this.categories;
	}
	
}
