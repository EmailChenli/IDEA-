package com.example.demo.entity;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {
	private int jobId;
	private String jobName;
	private String jobMsg;
	private int departmentId;
	private Timestamp createTime;
	private Timestamp modifyTime;
}
