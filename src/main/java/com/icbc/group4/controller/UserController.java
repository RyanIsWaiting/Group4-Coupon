package com.icbc.group4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.icbc.group4.service.IUserService;
import com.icbc.group4.util.Result;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"http://172.20.10.4:8084", "null"})
public class UserController {
	
	@Autowired
	private IUserService userService;
	
    @GetMapping(value = "/checkUser")
    @ResponseBody
    public Result checkUser(@RequestParam("phone") String phone,
    		@RequestParam("id") String id){
        return userService.checkUser(phone, id);
    }
    @GetMapping(value = "/register")
    @ResponseBody
    public Long register(@RequestParam("name") String name, @RequestParam("phone") String phone,
    		@RequestParam("id") String id){
        return userService.register(name, phone, id);
    }
}
