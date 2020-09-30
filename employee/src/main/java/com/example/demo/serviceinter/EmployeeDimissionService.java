package com.example.demo.serviceinter;

import java.util.List;

import com.example.demo.entity.EmployeeDimission;

public interface EmployeeDimissionService {
	EmployeeDimission findById(Long employeeDimissionId);
	List<EmployeeDimission> findAll();
}
