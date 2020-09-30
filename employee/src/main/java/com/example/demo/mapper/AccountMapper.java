package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.Account;

@Mapper
public interface AccountMapper {
	List<Account> findAll();
	Account findById(@Param("accountId")Long accountId);
}
