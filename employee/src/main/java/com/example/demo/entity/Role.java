package com.example.demo.entity;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
	private int roleId;
	private String roleName;
	private Timestamp createTime;
	private Timestamp modifyTime;
}
