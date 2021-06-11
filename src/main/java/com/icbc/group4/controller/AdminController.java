package com.icbc.group4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.icbc.group4.domain.Category;
import com.icbc.group4.service.IAdminService;
import com.icbc.group4.service.ICategoryService;
import com.icbc.group4.util.Result;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = {"http://172.20.10.4:8084", "null"})
public class AdminController {
	
	@Autowired
	private IAdminService adminService;
	@Autowired
	private ICategoryService categoryService;
	
    /**
           * 登录
     * @param admin 参数封装
     * @return Result
     */
    @PostMapping(value = "/login")
    @ResponseBody
    public Result login(@RequestParam("account") String account,
    		@RequestParam("password") String password){
        return adminService.login(account, password);
    }
    
    @GetMapping(value = "/getAllCoupons")
    @ResponseBody
    public List<Category> getAllCoupons(){
        return categoryService.getAllCategories();
    }
}
