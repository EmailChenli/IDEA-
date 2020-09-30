package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeDimission;
import com.example.demo.entitytools.ResultsConstructor;
import com.example.demo.serviceinter.EmployeeDimissionService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("sys/employeedimission")
@Slf4j
public class EmployeeDimissionController {
	@Autowired
	private EmployeeDimissionService  employeeDimissionService;
	
	@GetMapping("findall")
	public ResultsConstructor<List<EmployeeDimission>> findEmployeeDimissionAll(){
		try {
			log.info("All_EmployeeDimission!");
			ResultsConstructor<List<EmployeeDimission>> result = new ResultsConstructor<List<EmployeeDimission>>();
			result.setCode(200);
			result.setMsg("获取成功");
			result.setData(employeeDimissionService.findAll());
			return result;
		}catch(Exception e){
			ResultsConstructor<List<EmployeeDimission>> result = new ResultsConstructor<List<EmployeeDimission>>();
			result.setCode(444);
			result.setMsg("获取失败");
			return result;
		}
	} 
	
	@GetMapping("findbyid/{employeeDimissionId}")
	public ResultsConstructor<?> findEmployeeByid(@PathVariable("employeeDimissionId") Long employeeDimissionId){
		try {
			log.info("employeeDimission_ID:"+employeeDimissionId);
			ResultsConstructor<EmployeeDimission> result = new ResultsConstructor<EmployeeDimission>();
			result.setCode(200);
			result.setMsg("获取成功");
			result.setData(employeeDimissionService.findById(employeeDimissionId));
			return result;
		}catch(Exception e){
			ResultsConstructor<EmployeeDimission> result = new ResultsConstructor<EmployeeDimission>();
			result.setCode(444);
			result.setMsg("获取失败");
			return result;
		}
	} 
}
