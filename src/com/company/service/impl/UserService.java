package com.company.service.impl;

import com.company.model.User;

public interface UserService {
    void addUser(User...user);
    void getUser(int id);
    void removeUser(int id);
    void getUsers();
}
