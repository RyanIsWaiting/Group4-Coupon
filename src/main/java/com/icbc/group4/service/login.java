package com.icbc.group4.service;

import org.springframework.http.HttpRequest;

public interface login {
	// ����������
		
	public boolean login(HttpRequest request);
	public boolean logout(HttpRequest request); 
}
