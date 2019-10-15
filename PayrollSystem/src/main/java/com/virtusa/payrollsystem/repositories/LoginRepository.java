package com.virtusa.payrollsystem.repositories;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.virtusa.payrollsystem.models.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {
	
	@Query("select login from Login login where login.employee.employeId = :employeId")
	public Login getLogin(@Param("employeId") int employeId);
	
	@Transactional
	@Modifying
	@Query("update Login login set login.password = :newPassword where login.employee.employeId = :employeId")
	public int reset(@Param("employeId") int employeId, @Param("newPassword") String newPassword);
}
