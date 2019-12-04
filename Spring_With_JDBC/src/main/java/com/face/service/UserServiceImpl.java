package com.face.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.face.dao.UserDao;
import com.face.model.Login;
import com.face.model.User;

public class UserServiceImpl implements UserService{
	@Autowired
	public UserDao userDao;
	public void register(User user) {
		userDao.register(user);
	}
	public User validateUser(Login login) {
		return userDao.validateUser(login);
		
	}

}
