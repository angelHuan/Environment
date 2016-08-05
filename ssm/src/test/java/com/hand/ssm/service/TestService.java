package com.hand.ssm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hand.ssm.dao.TestDao;
import com.hand.ssm.entity.User;

@Service("testService")
public class TestService {
	
	@Resource
	private TestDao testDao;
	
	public void addUser(User user){
		testDao.addUser(user);
		//int i = 1/0;
	}
	
	public User findById(String id){
		User user = testDao.findById(id);
		return user;
	}
	
}
