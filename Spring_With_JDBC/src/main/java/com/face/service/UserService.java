package com.face.service;

import com.face.model.Login;
import com.face.model.User;

public interface UserService {
void register(User user);
User validateUser(Login login);
}
