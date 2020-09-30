package com.example.demo.serviceinterimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Account;
import com.example.demo.mapper.AccountMapper;
import com.example.demo.serviceinter.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountMapper accountMapper;
	@Override
	public Account findById(Long accountId) {
		// TODO Auto-generated method stub
		return accountMapper.findById(accountId);
	}

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return accountMapper.findAll();
	}

}
