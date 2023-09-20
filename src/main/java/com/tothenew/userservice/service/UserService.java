package com.tothenew.userservice.service;

import com.tothenew.userservice.model.User;

import java.util.List;

public interface UserService {
    User registerUser(User user);

    List<User> findAllUsers();

    List<User> findUserByEmail(String email);

    List<User> cancelRegistration(int id);
}
