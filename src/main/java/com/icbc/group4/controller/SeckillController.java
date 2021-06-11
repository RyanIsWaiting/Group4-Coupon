package com.icbc.group4.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seckill")
@CrossOrigin(origins = {"http://172.20.10.4:8084", "null"})
public class SeckillController {
	@ResponseBody
	@RequestMapping("/seckill")
	public String seckill(){
		return "hello";
	}
}
