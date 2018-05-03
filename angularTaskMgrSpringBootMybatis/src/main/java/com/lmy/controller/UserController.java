package com.lmy.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmy.pojo.User;
import com.lmy.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/users")
	public List<User> getUsers(){
		return this.userService.getUsers();
	}
	
	@RequestMapping("/users/{name}")
	public List<User> getUsersByName(@PathVariable String name){
		return this.userService.getUsersByName(name);
	}
}
