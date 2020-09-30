package com.example.demo.entity;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
	private Long accountId;
	private String accountName;
	private String accountPassword;
	private Long employeeId;
	private Timestamp createTime;
	private Timestamp modifyTime;
}
