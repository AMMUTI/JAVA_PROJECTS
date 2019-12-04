package com.face.dao;

import com.face.model.Login;
import com.face.model.User;

public interface UserDao {

	
	void register(User user);
	User validateUser(Login login);
}
