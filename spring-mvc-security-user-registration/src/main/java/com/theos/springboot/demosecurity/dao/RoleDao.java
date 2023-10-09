package com.theos.springboot.demosecurity.dao;

import com.theos.springboot.demosecurity.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
