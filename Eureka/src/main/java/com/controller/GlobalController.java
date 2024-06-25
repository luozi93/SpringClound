package com.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.utils.Result;

@RestController
@SuppressWarnings("rawtypes")
public class GlobalController {
	private Logger log = LogManager.getLogger("default");
	
	
	@ResponseBody
	@RequestMapping(value="/start", produces="application/json;charset=UTF-8")
	public Result queryDays(){

		log.info("start");

		return Result.SUCESS();
	}
}
