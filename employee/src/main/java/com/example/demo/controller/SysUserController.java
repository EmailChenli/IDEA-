package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SysUser;
import com.example.demo.entitytools.ResultsConstructor;
import com.example.demo.serviceinter.SysUserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("sys/sysuser")
@Slf4j
public class SysUserController {
	@Autowired
	private SysUserService sysUserService;
	@GetMapping("findall")
	public ResultsConstructor<List<SysUser>> findSysUserAll(){

		try {
			log.info("All_SysUser!");
			ResultsConstructor<List<SysUser>> result = new ResultsConstructor<List<SysUser>>();
			result.setCode(200);
			result.setMsg("获取成功");
			result.setData(sysUserService.findAll());
			return result;
		}catch(Exception e){
			ResultsConstructor<List<SysUser>> result = new ResultsConstructor<List<SysUser>>();
			result.setCode(444);
			result.setMsg("获取失败");
			return result;
		}
	} 
	
	@GetMapping("findbyid/{sysuserId}")
	public ResultsConstructor<?> findSysUserByid(@PathVariable("sysuserId") Long sysuserId){

		try {
			log.info("sysuser_id:"+sysuserId);
			ResultsConstructor<SysUser> result = new ResultsConstructor<SysUser>();
			result.setCode(200);
			result.setMsg("获取成功");
			result.setData(sysUserService.findById(sysuserId));
			return result;
		}catch(Exception e){
			ResultsConstructor<SysUser> result = new ResultsConstructor<SysUser>();
			result.setCode(444);
			result.setMsg("获取失败");
			return result;
		}
	} 
}
