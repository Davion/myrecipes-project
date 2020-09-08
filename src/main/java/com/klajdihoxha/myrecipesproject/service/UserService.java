package com.klajdihoxha.myrecipesproject.service;

import com.klajdihoxha.myrecipesproject.model.User;

import java.util.List;

public interface UserService {

    User signup(User user);

    List<User> getUsers();
    User findUserById(Long userId);
    User findUserByEmail(String emailId);

    User updateProfile(Long userId, User updatedUser);
    User changePassword(User user, String newPassword);

    void deleteUser(Long unserId);

}
