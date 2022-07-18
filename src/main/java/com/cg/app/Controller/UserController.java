package com.cg.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.entity.User;
import com.cg.app.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user)
	{
		return userService.addUser(user);
	}
	
	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User user)
	{
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/deleteuser")
	public String deleteUser(@RequestParam Long userId)
	{
		userService.cancelUser(userId);
		return "User successfully deleted";
	}
	
	@GetMapping("/getallusers")
	public List<User> getAllUsers()
	{
		return userService.showAllUser();
	}
	
	@GetMapping("/getuserbyid")
	public User getUserById(@RequestParam Long userId)
	{
		return userService.showUserById(userId);
	}
}
