package com.icbc.group4.service;

import org.apache.shardingsphere.api.hint.HintManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icbc.group4.dao.IAdminDao;
import com.icbc.group4.domain.Admin;
import com.icbc.group4.util.Result;

@Service
public class AdminServiceImpl implements IAdminService {
	
	@Autowired
	private IAdminDao adminDao;

	public Result login(String account, String password) {
		Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
        	// force routing master
//            HintManager.getInstance().setMasterRouteOnly();
        	Admin id = adminDao.login(account, password);
        	System.out.println(id);
            if(id == null){
                result.setMsg("用户名或密码错误");
            }else{
                result.setMsg("登录成功");
                result.setSuccess(true);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
	}

}
