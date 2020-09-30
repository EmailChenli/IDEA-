package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Job;
import com.example.demo.entitytools.ResultsConstructor;
import com.example.demo.serviceinter.JobService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("sys/job")
@Slf4j
public class JobController {
	@Autowired
	private JobService jobService;
	@GetMapping("findall")
	public ResultsConstructor<List<Job>> findJobAll(){

		try {
			log.info("All_job!");
			ResultsConstructor<List<Job>> result = new ResultsConstructor<List<Job>>();
			result.setCode(200);
			result.setMsg("获取成功");
			result.setData(jobService.findAll());
			return result;
		}catch(Exception e){
			ResultsConstructor<List<Job>> result = new ResultsConstructor<List<Job>>();
			result.setCode(444);
			result.setMsg("获取失败");
			return result;
		}
	} 
	
	@GetMapping("findbyid/{jobId}")
	public ResultsConstructor<?> findJobByid(@PathVariable("jobId") Integer jobId){

		try {
			log.info("Job_ID:"+jobId);
			ResultsConstructor<Job> result = new ResultsConstructor<Job>();
			result.setCode(200);
			result.setMsg("获取成功");
			result.setData(jobService.findById(jobId));
			return result;
		}catch(Exception e){
			ResultsConstructor<Job> result = new ResultsConstructor<Job>();
			result.setCode(444);
			result.setMsg("获取失败");
			return result;
		}
	} 
}
