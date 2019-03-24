package com.java.test.project.services;

import com.java.test.project.dao.UserDao;
import com.java.test.project.dao.UserDaoImpl;
import com.java.test.project.models.Auto;
import com.java.test.project.models.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao usersDao = new UserDaoImpl();

    public UserServiceImpl() {
    }

    public User findUser(int id) {
        return usersDao.findById(id);
    }

    public void saveUser(User user) {
        usersDao.save(user);
    }

    public void deleteUser(User user) {
        usersDao.delete(user);
    }

    public void updateUser(User user) {
        usersDao.update(user);
    }

    public List<User> findAllUsers() {
        return usersDao.findAll();
    }

    public Auto findAutoById(int id) {
        return usersDao.findAutoById(id);
    }
}
