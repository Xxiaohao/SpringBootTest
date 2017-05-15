package com.test.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.web.dao.UserDAO;

@Service("userService")
public class UserService {
	@Autowired
	private UserDAO userDAO;
	
	public void insetUser() throws Exception {
		userDAO.insetUser();
	}
}
