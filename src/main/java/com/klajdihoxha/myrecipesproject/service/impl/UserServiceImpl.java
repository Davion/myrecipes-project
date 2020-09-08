package com.klajdihoxha.myrecipesproject.service.impl;

import com.klajdihoxha.myrecipesproject.model.User;
import com.klajdihoxha.myrecipesproject.repository.UserRepository;
import com.klajdihoxha.myrecipesproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public User signup(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @Override
    public User findUserById(Long userId) {
        return userRepo.findById(userId).get();
    }

    @Override
    public User findUserByEmail(String emailId) {
        return userRepo.findByEmail(emailId);
    }

    @Override
    public User updateProfile(Long userId, User updatedUser) {
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
        if(updatedUser.getMobileNumber() != null) {
            user.setMobileNumber(updatedUser.getMobileNumber());
        }

        return userRepo.save(user);
    }

    @Override
    public User changePassword(User user, String newPassword) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {
        userRepo.deleteById(userId);
    }
}
