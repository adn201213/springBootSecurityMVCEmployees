package com.adnan.springboot.demo.dao;

import com.adnan.springboot.demo.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
