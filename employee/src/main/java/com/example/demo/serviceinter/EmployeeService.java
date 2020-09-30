package com.example.demo.serviceinter;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	Employee findById(Long employeeId);
	List<Employee> findAll();
}
