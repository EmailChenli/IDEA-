package com.example.demo.serviceinter;

import java.util.List;

import com.example.demo.entity.SysUser;

public interface SysUserService {
	List<SysUser> findAll();
	SysUser findById(Long sysuserId);
}
