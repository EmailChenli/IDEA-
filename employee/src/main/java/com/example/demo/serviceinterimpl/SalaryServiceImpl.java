package com.example.demo.serviceinterimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Salary;
import com.example.demo.mapper.SalaryMapper;
import com.example.demo.serviceinter.SalaryService;

@Service
public class SalaryServiceImpl implements SalaryService{
	@Autowired
	private SalaryMapper salaryMapper;
	@Override
	public List<Salary> findAll() {
		return salaryMapper.findAll();
	}

	@Override
	public Salary findById(Long salaryId) {
		return salaryMapper.findById(salaryId);
	}

}
