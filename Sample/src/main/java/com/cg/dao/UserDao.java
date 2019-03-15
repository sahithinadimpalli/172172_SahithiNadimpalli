package com.cg.dao;

import com.cg.model.Login;
import com.cg.model.User;

public interface UserDao {
  void register(User user);
  User validateUser(Login login);
}
