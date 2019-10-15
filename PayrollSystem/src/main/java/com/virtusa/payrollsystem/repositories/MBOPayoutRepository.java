package com.virtusa.payrollsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.virtusa.payrollsystem.models.MBOPayout;

public interface MBOPayoutRepository extends JpaRepository<MBOPayout, Integer> {
	
	@Query("SELECT mboPayout FROM MBOPayout mboPayout WHERE mboPayout.perfomance.perfomanceId = :id")
	MBOPayout getMBOPayout(@Param("id") int perfomanceId);
	
}
