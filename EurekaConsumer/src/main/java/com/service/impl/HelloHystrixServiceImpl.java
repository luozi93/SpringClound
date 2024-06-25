package com.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.HelloService;

@Component
public class HelloHystrixServiceImpl implements HelloService{

	@Override
	public String hello(@RequestParam(value = "name") String name) {
		// TODO Auto-generated method stub
		return "hello " +name+", this messge send failed ";
	}

}
