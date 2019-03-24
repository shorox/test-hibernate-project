package com.java.test.project.dao;

import com.java.test.project.models.Auto;
import com.java.test.project.models.User;

import java.util.List;

public interface UserDao {
    User findById(int id);
    void save(User user);
    void update(User user);
    void delete(User user);
    Auto findAutoById(int id);
    List<User> findAll();
}
