package com.cg.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.entity.User;
import com.cg.app.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	public User addUser(User user)
	{
		return userRepo.save(user);
	}
	
	public User updateUser(User user)
	{
		return userRepo.save(user);
	}
	
	public void cancelUser(Long userId)
	{
		userRepo.deleteById(userId);
	}
	
	public List<User> showAllUser()
	{
		return userRepo.findAll();
	}
	
	public User showUserById(Long userId)
	{
		return userRepo.getReferenceById(userId);
	}
}
