package com.icbc.group4.domain;

public class Merchant {
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
