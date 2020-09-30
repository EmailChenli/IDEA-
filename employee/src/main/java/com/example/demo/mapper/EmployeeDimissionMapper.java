package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.EmployeeDimission;

@Mapper
public interface EmployeeDimissionMapper {
	List<EmployeeDimission> findAll();
	EmployeeDimission findById(@Param("employeeDimissionId")Long employeeDimissionId);
}
