package com.theos.springboot.demosecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.theos.springboot.demosecurity.entity.User;
import com.theos.springboot.demosecurity.user.WebUser;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	void save(WebUser webUser);

}
