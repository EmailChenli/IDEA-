package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.entitytools.ResultsConstructor;
import com.example.demo.serviceinter.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("sys/employee")
@Slf4j
public class EmployeeController {
	@Autowired
	private EmployeeService  employeeService;
	
	@GetMapping("findall")
	public ResultsConstructor<List<Employee>> findEmployeeAll(){
		try {
			log.info("All_employee!");
			ResultsConstructor<List<Employee>> result = new ResultsConstructor<List<Employee>>();
			result.setCode(200);
			result.setMsg("获取成功");
			result.setData(employeeService.findAll());
			return result;
		}catch(Exception e){
			ResultsConstructor<List<Employee>> result = new ResultsConstructor<List<Employee>>();
			result.setCode(444);
			result.setMsg("获取失败");
			return result;
		}
	} 
	
	@GetMapping("findbyid/{employeeId}")
	public ResultsConstructor<?> findEmployeeByid(@PathVariable("employeeId") Long employeeId){
		try {
			log.info("employee_ID:"+employeeId);
			ResultsConstructor<Employee> result = new ResultsConstructor<Employee>();
			result.setCode(200);
			result.setMsg("获取成功");
			result.setData(employeeService.findById(employeeId));
			return result;
		}catch(Exception e){
			ResultsConstructor<Employee> result = new ResultsConstructor<Employee>();
			result.setCode(444);
			result.setMsg("获取失败");
			return result;
		}
	} 
}
