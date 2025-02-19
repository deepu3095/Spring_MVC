package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserServiceImpl  implements UserService{
    
	@Autowired
	private UserRepo repo;
	@Override
	public void registerUser(User user) {
		repo.save(user);
    }
	
	

}
