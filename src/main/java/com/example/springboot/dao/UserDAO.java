package com.example.springboot.dao;


import com.example.springboot.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);

    User getUserById(Long id);
}
