package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Role;
import com.example.demo.entitytools.ResultsConstructor;
import com.example.demo.serviceinter.RoleService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("sys/role")
@Slf4j
public class RoleController {
	@Autowired
	private RoleService roleService;
	@GetMapping("findall")
	public ResultsConstructor<List<Role>> findRoleAll(){

		try {
			log.info("All_Role!");
			ResultsConstructor<List<Role>> result = new ResultsConstructor<List<Role>>();
			result.setCode(200);
			result.setMsg("获取成功");
			result.setData(roleService.findAll());
			return result;
		}catch(Exception e){
			ResultsConstructor<List<Role>> result = new ResultsConstructor<List<Role>>();
			result.setCode(444);
			result.setMsg("获取失败");
			return result;
		}
	} 
	
	@GetMapping("findbyid/{role_id}")
	public ResultsConstructor<Role> findJobByid(@PathVariable("roleId") Integer roleId){

		try {
			log.info("role_id:"+roleId);
			ResultsConstructor<Role> result = new ResultsConstructor<Role>();
			result.setCode(200);
			result.setMsg("获取成功");
			result.setData(roleService.findById(roleId));
			return result;
		}catch(Exception e){
			ResultsConstructor<Role> result = new ResultsConstructor<Role>();
			result.setCode(444);
			result.setMsg("获取失败");
			return result;
		}
	} 
}
