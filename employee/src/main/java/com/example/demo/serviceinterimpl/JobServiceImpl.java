package com.example.demo.serviceinterimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Job;
import com.example.demo.mapper.JobMapper;
import com.example.demo.serviceinter.JobService;

@Service
public class JobServiceImpl implements JobService{
	@Autowired
	private JobMapper jobMapper;
	@Override
	public Job findById(Integer jobId) {
		// TODO Auto-generated method stub
		return jobMapper.findById(jobId);
	}

	@Override
	public List<Job> findAll() {
		// TODO Auto-generated method stub
		return jobMapper.findAll();
	}

}
