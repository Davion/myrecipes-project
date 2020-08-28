package com.klajdihoxha.myrecipesproject.controller;

import java.util.List;

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

import com.klajdihoxha.myrecipesproject.data.UserRepository;
import com.klajdihoxha.myrecipesproject.domain.User;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping()
	public List<User> getUsers(){
		return userRepo.findAll();
	}
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable Long userId){
		return userRepo.findById(userId).get();
	}
	
	@PostMapping(consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public User createUser(@RequestBody User user) {
		return userRepo.save(user);
	}
	
	@PutMapping(path = "/{userId}", consumes = "application/json")
	public User updateUser(@PathVariable Long userId, 
								@RequestBody User updatedUser) {
		
		User user = userRepo.findById(userId).get();
		
		if(updatedUser.getFirstName() != null) {
			user.setFirstName(updatedUser.getFirstName());
		}
		if(updatedUser.getLastName() != null) {
			user.setLastName(updatedUser.getLastName());
		}
		if(updatedUser.getEmail() != null) {
			user.setEmail(updatedUser.getEmail());
		}
		if(updatedUser.getPassword() != null) {
			user.setPassword(updatedUser.getPassword());
		}
		if(updatedUser.getBirthday() != null) {
			user.setBirthday(updatedUser.getBirthday());
		}
		
		return userRepo.save(user);		
	}
	
	@DeleteMapping("/{userId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteUser(@PathVariable Long userId) {
		
		try {
			userRepo.deleteById(userId);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
