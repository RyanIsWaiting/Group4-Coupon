package com.icbc.group4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@ResponseBody
	@RequestMappin1g("/hello")
	public String hello(){
		return "123";
	}
}
