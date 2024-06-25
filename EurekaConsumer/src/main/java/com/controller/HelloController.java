package com.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.HelloService;
import com.utils.Result;

@RestController
@SuppressWarnings("rawtypes")
public class HelloController {
	private Logger log = LogManager.getLogger("default");
	
	@Autowired
	private HelloService helloService;
	
	@Value("${neo.hello}")
    private String hello;
	
	@RequestMapping(value="/hello/{name}", produces="application/json;charset=UTF-8")
    public Result index(@PathVariable("name") String name) {
		
		log.info(this.hello);
		
        return Result.SUCESS(helloService.hello(name) + ":" + this.hello);
    }
}
