package com.java.test.project.services;

import com.java.test.project.models.Auto;
import com.java.test.project.models.User;

import java.util.List;

public interface UserService {
    User findUser(int id);
    void saveUser(User user);
    void deleteUser(User user);
    void updateUser(User user);
    List<User> findAllUsers();
    Auto findAutoById(int id);
}
