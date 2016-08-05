package com.hand.ssm.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.hand.ssm.entity.User;

@Repository("testDao")
public class TestDao {
	
	@Resource
	private SqlSessionFactory sqlSessionFactory;
	
	//添加用户
	public void addUser(User user){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert(User.class.getName()+".addUser", user);
		sqlSession.close();
	}
	
	//通过用户id查找用户
	public User findById(String id){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user = sqlSession.selectOne(User.class.getName()+".findById", id);
		sqlSession.close();
		
		return user;
	}
	
}
