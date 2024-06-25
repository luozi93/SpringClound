package com.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.impl.HelloHystrixServiceImpl;

@FeignClient(value="eureka-producer", fallback=HelloHystrixServiceImpl.class)
public interface HelloService {
	@RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
