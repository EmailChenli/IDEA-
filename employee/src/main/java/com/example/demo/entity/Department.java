package com.example.demo.entity;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	private int departmentId;
	private String departmentName;
	private String departmentMsg;
	private Timestamp createTime;
	private Timestamp modifyTime;
}
