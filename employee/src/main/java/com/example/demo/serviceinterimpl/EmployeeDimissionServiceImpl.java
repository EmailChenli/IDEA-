package com.example.demo.serviceinterimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeDimission;
import com.example.demo.mapper.EmployeeDimissionMapper;
import com.example.demo.serviceinter.EmployeeDimissionService;

@Service
public class EmployeeDimissionServiceImpl implements EmployeeDimissionService{
	@Autowired
	private EmployeeDimissionMapper employeeDimissionMapper;
	@Override
	public EmployeeDimission findById(Long employeeDimissionId) {
		// TODO Auto-generated method stub
		return employeeDimissionMapper.findById(employeeDimissionId);
	}

	@Override
	public List<EmployeeDimission> findAll() {
		// TODO Auto-generated method stub
		return employeeDimissionMapper.findAll();
	}

}
