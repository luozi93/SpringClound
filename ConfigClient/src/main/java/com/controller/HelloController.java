package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utils.Result;

@RestController
@SuppressWarnings("rawtypes")
public class HelloController {
	
    @Value("${neo.hello}")
    private String hello;
   
	@RequestMapping(value="/hello", produces="application/json;charset=UTF-8")
    public Result from() {
        return Result.SUCESS(this.hello);
    }
}