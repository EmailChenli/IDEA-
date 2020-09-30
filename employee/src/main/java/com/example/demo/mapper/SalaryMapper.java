package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.Salary;

@Mapper
public interface SalaryMapper {
	List<Salary> findAll();
	Salary findById(@Param("salaryId")Long salaryId);
}
