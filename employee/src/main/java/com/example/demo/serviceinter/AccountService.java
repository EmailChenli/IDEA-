package com.example.demo.serviceinter;

import java.util.List;

import com.example.demo.entity.Account;

public interface AccountService {
	Account findById(Long accountId);
	List<Account> findAll();
}
