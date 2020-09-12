package com.adnan.springboot.demo.service;

import com.adnan.springboot.demo.entity.User;
import com.adnan.springboot.demo.user.CrmUser;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	public void save(CrmUser crmUser);
}
