package com.klajdihoxha.myrecipesproject.controller;

import java.util.List;

import com.klajdihoxha.myrecipesproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.klajdihoxha.myrecipesproject.model.User;
import com.klajdihoxha.myrecipesproject.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping()
	public List<User> getUsers(){
		return userService.getUsers();
	}
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable Long userId){
		return userService.findUserById(userId);
	}
	
	@PostMapping(consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public User createUser(@RequestBody User user) {
		return userService.signup(user);
	}
	
	@PutMapping(path = "/{userId}", consumes = "application/json")
	public User updateUser(@PathVariable Long userId, 
								@RequestBody User updatedUser) {
		
		return userService.updateProfile(userId, updatedUser);
	}
	
	@DeleteMapping("/{userId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteUser(@PathVariable Long userId) {
		userService.deleteUser(userId);
	}
}
