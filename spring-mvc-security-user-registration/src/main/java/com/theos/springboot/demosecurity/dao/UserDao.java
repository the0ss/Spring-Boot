package com.theos.springboot.demosecurity.dao;

import com.theos.springboot.demosecurity.entity.User;

public interface UserDao {

    User findByUserName(String userName);

    void save(User theUser);
}
