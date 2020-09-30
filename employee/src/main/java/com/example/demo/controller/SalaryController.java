package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Salary;
import com.example.demo.entitytools.ResultsConstructor;
import com.example.demo.serviceinter.SalaryService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("sys/salary")
@Slf4j
public class SalaryController {
	@Autowired
	private SalaryService salaryService;
	@GetMapping("findall")
	public ResultsConstructor<List<Salary>> findSalaryAll(){

		try {
			log.info("All_Salary!");
			ResultsConstructor<List<Salary>> result = new ResultsConstructor<List<Salary>>();
			result.setCode(200);
			result.setMsg("获取成功");
			result.setData(salaryService.findAll());
			return result;
		}catch(Exception e){
			ResultsConstructor<List<Salary>> result = new ResultsConstructor<List<Salary>>();
			result.setCode(444);
			result.setMsg("获取失败");
			return result;
		}
	} 
	
	@GetMapping("findbyid/{salary_id}")
	public ResultsConstructor<?> findSalaryByid(@PathVariable("salaryId") Long salaryId){

		try {
			log.info("salary_ID:"+salaryId);
			ResultsConstructor<Salary> result = new ResultsConstructor<Salary>();
			result.setCode(200);
			result.setMsg("获取成功");
			result.setData(salaryService.findById(salaryId));
			return result;
		}catch(Exception e){
			ResultsConstructor<Salary> result = new ResultsConstructor<Salary>();
			result.setCode(444);
			result.setMsg("获取失败");
			return result;
		}
	} 
}
