package com.exc.user.service.services;

import java.util.List;

import com.exc.user.service.entities.User;

public interface UserService {
	User saveUser(User user);
	
	List<User> getAllUser();
	
	User getUser(String userId);
}
