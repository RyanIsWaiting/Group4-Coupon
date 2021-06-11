package com.icbc.group4.service;

import com.icbc.group4.domain.User;
import com.icbc.group4.util.Result;

public interface IUserService {
	Result checkUser(String phoneNumber, String identityNumber);
	Long register(String userName, String phoneNumber, String identityNumber);
}
