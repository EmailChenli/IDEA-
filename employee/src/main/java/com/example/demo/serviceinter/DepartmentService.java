package com.example.demo.serviceinter;

import java.util.List;

import com.example.demo.entity.Department;

public interface DepartmentService {
	//根据id查询
	Department findById(int departmentId);
	//查询所有部门
	List<Department> findAll();
	//根据对象id更新
	int updateDepartmentById(Department department);
	//根据关键字获取对象
	List<Department> selectDepartmentLike(int departmentId,String departmentName);
	//添加部门对象
	int addDepartment(Department department);
}
