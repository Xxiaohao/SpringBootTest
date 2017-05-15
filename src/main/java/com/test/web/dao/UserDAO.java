package com.test.web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.web.entity.User;
import com.test.web.mapper.UserMapper;

@Repository
public class UserDAO {
	@Autowired
	private UserMapper userMapper;
	
	public void insetUser() throws Exception {
		User user = new User();
		user.setUserName("李四");
		user.setAge(23);
		userMapper.save(user);
		System.out.println("插入用户信息"+user.getUserName());
	}
}
