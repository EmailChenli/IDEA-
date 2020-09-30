package com.example.demo.serviceinterimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.serviceinter.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentMapper departmentMapper;
	@Override
	public Department findById(int departmentId) {
		return departmentMapper.selectDepartmentById(departmentId);
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return departmentMapper.selectDepartmentAll();
	}

	@Override
	public int updateDepartmentById(Department department) {
		// TODO Auto-generated method stub
		return departmentMapper.updateDepartmentById(department);
	}

	@Override
	public List<Department> selectDepartmentLike(int departmentId, String departmentName) {
		// TODO Auto-generated method stub
		return departmentMapper.selectDepartmentLike(departmentId, departmentName);
	}

	@Override
	public int addDepartment(Department department) {
		return departmentMapper.addDepartment(department);
	}

}
