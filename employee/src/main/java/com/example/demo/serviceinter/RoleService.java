package com.example.demo.serviceinter;

import java.util.List;

import com.example.demo.entity.Role;

public interface RoleService {
	Role findById(Integer roleId);
	List<Role> findAll();
}
