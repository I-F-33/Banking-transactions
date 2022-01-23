package com.coderscampus.assignment13.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.coderscampus.assignment13.domain.Account;
import com.coderscampus.assignment13.domain.User;
import com.coderscampus.assignment13.repository.AccountRepository;

public class AccountService {

	@Autowired
	AccountRepository accountRepo;
	
	public Account saveAccountToUser(Account account, User user) {
			account.getUsers().add(user);
			user.getAccounts().add(account);
			return accountRepo.save(account);
	}
}
