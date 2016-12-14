package com.photoalbum.service;

import com.photoalbum.model.User;

public interface UserService {
	
	User save(User user);
	
	User findByUserName(String userName);
}
