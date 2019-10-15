package com.virtusa.payrollsystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.payrollsystem.models.BankAccount;
import com.virtusa.payrollsystem.repositories.BankAccountRepository;

@Service
public class BankAccountService {
	
	@Autowired
	private BankAccountRepository bankAccountRepository;
	
	public BankAccount editBankAccount(BankAccount account) {
		return bankAccountRepository.save(account);
	}
}
