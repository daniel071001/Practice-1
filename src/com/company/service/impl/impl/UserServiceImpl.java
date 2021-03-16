package com.company.service.impl.impl;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.impl.UserService;

import java.util.Map;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDao();


    @Override
    public void addUser(User... user) {
        for (User inter : user) {
            userDao.users.put(inter.getId(), inter);
        }
    }

    
    @Override
    public void getUser(int id) {
        System.out.println(userDao.users.get(id));
    }

    @Override
    public void removeUser(int id) {
        userDao.users.remove(id);
    }

    @Override
    public void getUsers() {
        for (Map.Entry inter : userDao.users.entrySet()) {
            System.out.println(inter.getValue());
        }
    }
}
