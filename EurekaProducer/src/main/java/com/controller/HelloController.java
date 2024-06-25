package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.utils.Result;

@RestController
@SuppressWarnings("rawtypes")
public class HelloController {
	
	@RequestMapping(value="/hello", produces="application/json;charset=UTF-8")
	public Result index(@RequestParam String name) {
        return Result.SUCESS("hello "+name+"，this is first messge");
    }
}
