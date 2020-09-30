package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.Role;

@Mapper
public interface RoleMapper {
	List<Role> findAll();
	Role findById(@Param("roleId")Integer roleId);
}
