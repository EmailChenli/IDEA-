package com.example.demo.serviceinterimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.serviceinter.EmployeeService;

@Service("employeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {
	//没有注入bean对象获取空指针
	@Autowired
	private EmployeeMapper employeeMapper;
	@Override
	public Employee findById(Long employeeId) {
		// TODO Auto-generated method stub
		return employeeMapper.findById(employeeId);
	}
	
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeMapper.findAll();
	}

}
