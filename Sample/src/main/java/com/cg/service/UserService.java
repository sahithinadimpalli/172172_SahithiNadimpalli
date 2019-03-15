package com.cg.service;



import com.cg.model.Login;
import com.cg.model.User;

public interface UserService {

  void register(User user);

  User validateUser(Login login);
}