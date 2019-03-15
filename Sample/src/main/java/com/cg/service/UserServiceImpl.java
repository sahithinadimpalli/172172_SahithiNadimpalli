package com.cg.service;
import org.springframework.beans.factory.annotation.Autowired;
import com.cg.dao.UserDao;
import com.cg.model.Login;
import com.cg.model.User;
public class UserServiceImpl implements UserService {
	@Autowired
	  public UserDao userDao;

	  public void register(User user) {
	    userDao.register(user);
	  }

	  public User validateUser(Login login) {
	    return userDao.validateUser(login);
	  }

	}









  