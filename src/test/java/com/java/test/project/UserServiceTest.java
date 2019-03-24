package com.java.test.project;

import com.java.test.project.models.Auto;
import com.java.test.project.models.User;
import com.java.test.project.services.UserService;
import com.java.test.project.services.UserServiceImpl;
import org.junit.Test;

import java.sql.SQLException;

public class UserServiceTest {

    @Test
    public void test1() throws SQLException {

        UserService userService = new UserServiceImpl();

        User user = new User("Masha", 26);
        userService.saveUser(user);

        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(user);
        user.getAutos().add(ferrari);

        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.getAutos().add(ford);

        userService.updateUser(user);
    }

    @Test
    public void test2() throws SQLException {

        UserService userService = new UserServiceImpl();

        User user = new User("Masha",26);
        userService.saveUser(user);

        Auto ferrari = new Auto("Ferrari", "red");
        user.getAutos().add(ferrari);

        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.getAutos().add(ford);

        userService.updateUser(user);

        user.setName("Sasha");

        userService.updateUser(user);

        userService.deleteUser(user);
    }
}
