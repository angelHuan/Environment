package com.hand.ssm;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.ssm.dao.TestDao;
import com.hand.ssm.entity.User;
import com.hand.ssm.service.TestService;

public class EnvironmentTest {
	
	ClassPathXmlApplicationContext ctx;
	
	@Before
	public void loadCtx(){
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	
	@Test
	public void testSpring(){
		TestDao testDao = (TestDao) ctx.getBean("testDao");
		String id = "1";
		User user = testDao.findById(id);
		System.out.println(user);
	}
	
	
	@Test
	public void testTranction(){
		TestService testService = (TestService) ctx.getBean("testService");
		User user = new User("1111","tian","123456",22,"男");
		testService.addUser(user);
	}
	
}
