package com.virtusa.payrollsystem.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.virtusa.payrollsystem.models.Perfomance;

@Transactional
public interface PerfomanceRepository extends JpaRepository<Perfomance, Integer> {

	@Query("SELECT perfomance FROM Perfomance perfomance WHERE perfomance.employee.employeId = :employeId and perfomance.quater = :quater and perfomance.year = :year")
	Perfomance getPerfomance(@Param("employeId") int employeId, @Param("quater") int quater, @Param("year") int year );
	
}
