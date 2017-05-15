package com.test.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.web.bo.TestUserDTO;
import com.test.web.service.UserService;

@RestController
@RequestMapping("/test")
public class TestController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/test.do")
	public TestUserDTO test() {
		try {
			userService.insetUser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TestUserDTO testUserDTO = new TestUserDTO();
		testUserDTO.setId("123");
		testUserDTO.setName("张三");
		return testUserDTO;
	}
}
