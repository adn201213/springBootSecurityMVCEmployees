package com.adnan.springboot.demo.dao;

import com.adnan.springboot.demo.entity.User;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);
    
}
