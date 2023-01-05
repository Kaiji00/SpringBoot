package com.example.springboot.dao;



import com.example.springboot.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();

    void save(User user);

    void update(User user);

    void delete(User user);

    User getUserById(long id);
}
