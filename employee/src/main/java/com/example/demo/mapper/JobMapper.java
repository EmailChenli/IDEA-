package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.Job;

@Mapper
public interface JobMapper {
	
	List<Job> findAll();
	Job findById(@Param("jobId")Integer jobId);
}
