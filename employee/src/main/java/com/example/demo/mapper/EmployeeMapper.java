package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.Employee;

@Mapper
public interface EmployeeMapper {
//	@Select("select *from  tb_employee where employee_id=#{employee_id}")
	
	List<Employee> findAll();
	Employee findById(@Param("employeeId")Long employeeId);
}
