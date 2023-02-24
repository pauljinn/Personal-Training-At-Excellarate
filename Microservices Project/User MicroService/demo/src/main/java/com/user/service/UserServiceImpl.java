package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	List<User> list = List.of(
			new User(1L, "test", "1234"),
			new User(2L,"test1","5678"),
			new User(3L,"Test2","910112"));
	@Override
	public User getUser(Long id) {
		return list.stream().filter((user)->user.getUserId().equals(id)).findAny().orElse(null);
	}

}
