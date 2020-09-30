package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Account;
import com.example.demo.entitytools.ResultsConstructor;
import com.example.demo.serviceinter.AccountService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("sys/account")
@Slf4j
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@GetMapping("findall")
	public ResultsConstructor<List<Account>> findAccountAll(){
		try {
			log.info("All_Account!");
			ResultsConstructor<List<Account>> result = new ResultsConstructor<List<Account>>();
			result.setCode(200);
			result.setMsg("获取成功");
			result.setData(accountService.findAll());
			return result;
		}catch(Exception e){
			ResultsConstructor<List<Account>> result = new ResultsConstructor<List<Account>>();
			result.setCode(444);
			result.setMsg("获取失败");
			return result;
		}
	} 
	
	@GetMapping("findbyid/{accountId}")
	public ResultsConstructor<?> findEmployeeByid(@PathVariable("accountId") Long accountId){
		try {
			log.info("Account_ID:"+accountId);
			ResultsConstructor<Account> result = new ResultsConstructor<Account>();
			result.setCode(200);
			result.setMsg("获取成功");
			result.setData(accountService.findById(accountId));
			return result;
		}catch(Exception e){
			ResultsConstructor<Account> result = new ResultsConstructor<Account>();
			result.setCode(444);
			result.setMsg("获取失败");
			return result;
		}
	} 
}
