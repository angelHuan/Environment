package com.hand.ssm.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hand.ssm.entity.User;
import com.hand.ssm.service.TestService;

@RestController
@RequestMapping("/test")
public class TestController {

	@Resource
	private TestService testService;
	
	@RequestMapping(value="/findById/{id}",method=RequestMethod.GET)
	public @ResponseBody User findById(@PathVariable("id") String id){
		User user = testService.findById(id);
		return user;
	}
}
