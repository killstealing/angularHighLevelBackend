package com.lmy.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmy.mapper.UserMapper;
import com.lmy.pojo.User;

@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	public List<User> getUsers(){
		return this.userMapper.getUsers();
	}
	
	public List<User> getUsersByName(String name){
		return this.userMapper.getUsersByName(name);
	}
}
