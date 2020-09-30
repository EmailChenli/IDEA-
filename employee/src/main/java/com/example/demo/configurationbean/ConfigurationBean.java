package com.example.demo.configurationbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.serviceinter.AccountService;
import com.example.demo.serviceinter.DepartmentService;
import com.example.demo.serviceinter.EmployeeService;
import com.example.demo.serviceinter.JobService;
import com.example.demo.serviceinter.RoleService;
import com.example.demo.serviceinter.SalaryService;
import com.example.demo.serviceinter.SysUserService;
import com.example.demo.serviceinterimpl.AccountServiceImpl;
import com.example.demo.serviceinterimpl.DepartmentServiceImpl;
import com.example.demo.serviceinterimpl.EmployeeServiceImpl;
import com.example.demo.serviceinterimpl.JobServiceImpl;
import com.example.demo.serviceinterimpl.RoleServiceImpl;
import com.example.demo.serviceinterimpl.SalaryServiceImpl;
import com.example.demo.serviceinterimpl.SysUserServiceImpl;

@Configuration
public class ConfigurationBean {
	@Bean
	public EmployeeService employeeService(@Autowired EmployeeServiceImpl bean) {
		return bean;
	}
	
	@Bean
	public DepartmentService departmentService(@Autowired DepartmentServiceImpl bean) {
		return bean;
	}
	
	@Bean
	public JobService jobService(@Autowired JobServiceImpl bean) {
		return bean;
	}
	@Bean
	public SalaryService salaryService(@Autowired SalaryServiceImpl bean) {
		return bean;
	}
	@Bean
	public SysUserService sysUserService(@Autowired SysUserServiceImpl bean) {
		return bean;
	}
	@Bean
	public RoleService roleService(@Autowired RoleServiceImpl bean) {
		return bean;
	}
	@Bean
	public AccountService accountService(@Autowired AccountServiceImpl bean) {
		return bean;
	}
}
