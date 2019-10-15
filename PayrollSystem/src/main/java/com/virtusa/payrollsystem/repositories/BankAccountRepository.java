package com.virtusa.payrollsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.payrollsystem.models.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> {

}
