package com.company;

import com.company.Gender.Gender1;
import com.company.model.User;
import com.company.service.impl.impl.UserServiceImpl;

public class Main {

    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
        userService.addUser(new User(1, "Daniel", 23, Gender1.MALE),
                new User(2, "Doni", 19, Gender1.MALE),
                new User(3, "Baiymbek", 19, Gender1.MALE));
        System.out.println("First user");
        userService.getUser(1);
        System.out.println("Remove second user");
        userService.removeUser(2);

        userService.getUsers();
    }
}
