package com.tothenew.userservice.service;

import com.tothenew.userservice.model.User;
import com.tothenew.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        return this.userRepository.save(user);
    }
    public List<User> findAllUsers() {
        List<User> listOfUser=userRepository.findAll();
        System.out.println("List of Users:"+listOfUser);
        return listOfUser;
    }
    public List<User> findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    public List<User> cancelRegistration(int id) {
        userRepository.deleteById(id);
        return userRepository.findAll();
    }
}
