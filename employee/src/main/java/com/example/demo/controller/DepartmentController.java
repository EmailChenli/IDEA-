package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.entitytools.Page;
import com.example.demo.entitytools.ResultsConstructor;
import com.example.demo.serviceinter.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("sys/department")
@RestController
@Slf4j
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("findall")
	public ResultsConstructor<List<Department>> findDepartmentAll(){
		try {
			log.info("All_department!");
			ResultsConstructor<List<Department>> result = new ResultsConstructor<List<Department>>();
			result.setCode(200);
			result.setMsg("获取成功");
			result.setData(departmentService.findAll());
			return result;
		}catch(Exception e){
			ResultsConstructor<List<Department>> result = new ResultsConstructor<List<Department>>();
			result.setCode(444);
			result.setMsg("获取失败");
			return result;
		}
	} 
	
	@GetMapping("findbyid/{departmentId}")
	public ResultsConstructor<?> findEmployeeByid(@PathVariable("departmentId") int departmentId){
		try {
			log.info("Department_ID:"+departmentId);
			ResultsConstructor<Department> result = new ResultsConstructor<Department>();
			result.setCode(200);
			result.setMsg("获取成功");
			result.setData(departmentService.findById(departmentId));
			return result;
		}catch(Exception e){
			ResultsConstructor<Department> result = new ResultsConstructor<Department>();
			result.setCode(444);
			result.setMsg("获取失败");
			return result;
		}
	} 
	
	@PostMapping("update")
	public ResultsConstructor<Integer> EmployeeUpdate(@RequestBody Department department){
		try {
			log.info("Department_Success:"+departmentService.updateDepartmentById(department));
			ResultsConstructor<Integer> result = new ResultsConstructor<Integer>();
			result.setCode(200);
			result.setMsg("更新成功");
			result.setData(departmentService.updateDepartmentById(department));
			return result;
		}catch(Exception e){
			ResultsConstructor<Integer> result = new ResultsConstructor<Integer>();
			result.setCode(444);
			result.setMsg("更新失败");
			return result;
		}
	} 
	
	@PostMapping("findlike")
	public ResultsConstructor<List<Department>> EmployeeFindlike(@RequestBody Department department){
		try {
			log.info("Department_Success:"+department.getDepartmentId());
			ResultsConstructor<List<Department>> result = new ResultsConstructor<List<Department>>();
			result.setCode(200);
			result.setMsg("查询成功");
			result.setData(departmentService.selectDepartmentLike(department.getDepartmentId(), department.getDepartmentName()));
			return result;
		}catch(Exception e){
			ResultsConstructor<List<Department>> result = new ResultsConstructor<List<Department>>();
			result.setCode(444);
			result.setMsg("查询失败");
			return result;
		}
	} 
	
	
	@PostMapping("add")
	public ResultsConstructor<Integer> EmployeeAdd(@RequestBody Department department){
		try {
			log.info("Department_Success:"+department.getDepartmentId());
			ResultsConstructor<Integer> result = new ResultsConstructor<Integer>();
			result.setCode(200);
			result.setMsg("添加成功");
			result.setData(departmentService.addDepartment(department));
			return result;
		}catch(Exception e){
			ResultsConstructor<Integer> result = new ResultsConstructor<Integer>();
			result.setCode(444);
			result.setMsg("添加失败");
			return result;
		}
	} 

//	@PostMapping("limitfind")
//	public ResultsConstructor<Integer> EmployeeLimitFind(@RequestBody Page page){
//		try {
//			log.info("Department_Success:"+department.getDepartment_id());
//			ResultsConstructor<Integer> result = new ResultsConstructor<Integer>();
//			result.setCode(200);
//			result.setMsg("添加成功");
//			result.setData(departmentService.addDepartment(department));
//			return result;
//		}catch(Exception e){
//			ResultsConstructor<Integer> result = new ResultsConstructor<Integer>();
//			result.setCode(444);
//			result.setMsg("添加失败");
//			return result;
//		}
//	} 
}
