package com.example.demo.serviceinter;

import java.util.List;

import com.example.demo.entity.Job;

public interface JobService {
	Job findById(Integer jobId);
	List<Job> findAll();
}
