package com.lmy.mapper;

import java.util.List;

import com.lmy.pojo.User;

public interface UserMapper {
	public List<User> getUsers();
	public List<User> getUsersByName(String name);
	public User getUserByEmail(String email);
}
