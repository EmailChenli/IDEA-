package com.example.demo.entity;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private Long employeeId;
	private String employeeName;
	private String employeeSex;
	private String employeePhone;
	private String employeeEmail;
	private String employeeEduSchool;
	private String employeeIdcard;
	private String employeeAddress;
	private int jobId;
	private Timestamp createTime;
	private Timestamp modifyTime;
}
