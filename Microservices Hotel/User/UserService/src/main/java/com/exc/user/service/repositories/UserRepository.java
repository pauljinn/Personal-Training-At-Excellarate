package com.exc.user.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exc.user.service.entities.User;

public interface UserRepository extends JpaRepository<User, String>{

}
