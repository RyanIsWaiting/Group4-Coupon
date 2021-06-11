package com.icbc.group4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icbc.group4.dao.IUserDao;
import com.icbc.group4.domain.User;
import com.icbc.group4.util.Result;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private IUserDao userDao;
	
	public Result checkUser(String phoneNumber, String identityNumber) {
		Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
        	// force routing master
//            HintManager.getInstance().setMasterRouteOnly();
        	User user = userDao.checkUser(phoneNumber, identityNumber);
        	System.out.println(user);
            if(user == null){
                result.setMsg("可被注册");
            }else{
                result.setMsg("手机号或身份证已注册");
                result.setSuccess(true);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
	}

	public Long register(String userName, String phoneNumber, String identityNumber) {
		return userDao.register(userName, phoneNumber, identityNumber);
	}
	
}
