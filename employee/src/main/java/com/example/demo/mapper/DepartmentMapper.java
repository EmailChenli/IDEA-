package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.Department;

@Mapper 
public interface DepartmentMapper {
	//添加部门
	int addDepartment(@Param("department")Department department);
	//根据id删除
	int deleteDepartmentById(@Param("departmentId")int departmentId);
	//根据对象id更新
	int updateDepartmentById(@Param("department")Department department);
	//根据id查询
	Department selectDepartmentById(@Param("departmentId")int departmentId);
	//查询所有对象
	List<Department> selectDepartmentAll();
	//根据关键字查询
	List<Department> selectDepartmentLike(@Param("departmentId")int departmentId,@Param("departmentName")String departmentName);
}
