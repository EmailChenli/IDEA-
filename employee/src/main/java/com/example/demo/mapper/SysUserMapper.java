package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.SysUser;

@Mapper
public interface SysUserMapper {
	List<SysUser> findAll();
	SysUser findById(@Param("sysuserId")Long sysuserId);
}
