package com.example.demo.serviceinter;

import java.util.List;

import com.example.demo.entity.Salary;

public interface SalaryService {
	List<Salary> findAll();
	Salary findById(Long salaryId);
}
