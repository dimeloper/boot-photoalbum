package com.photoalbum.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.photoalbum.dao.UserDao;
import com.photoalbum.model.User;
import com.photoalbum.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	public User save (User user) {
		return userDao.save(user);
	}
	
	public User findByUserName(String userName) {
		return userDao.findByUserName(userName);
	}
}
