package com.example.demo.entity;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDimission {
	private Long employeeDimissionId;
	private String employeeDimissionName;
	private String employeeDimissionSex;
	private String employeeDimissionPhone;
	private String employeeDimissionEmail;
	private String employeeDimissionEduSchool;
	private String employeeDimissionIdcard;
	private String employeeDimissionAddress;
	private int jobId;
	private Timestamp createTime;
	private Timestamp modifyTime;
}
