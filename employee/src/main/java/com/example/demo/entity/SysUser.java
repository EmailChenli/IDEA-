package com.example.demo.entity;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser {
	private Long sysuserId;
	private String sysuserAccount;
	private String sysuserPassword;
	private int sysuserStatus;
	private int roleId ;
	private Timestamp createTime;
	private Timestamp modifyTime;
}
