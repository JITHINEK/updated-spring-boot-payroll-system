package com.virtusa.payrollsystem.services;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.payrollsystem.models.Employee;
import com.virtusa.payrollsystem.models.MBOPayout;
import com.virtusa.payrollsystem.models.Perfomance;
import com.virtusa.payrollsystem.repositories.MBOPayoutRepository;

@Service
public class MBOPayoutService {
	
	private Perfomance perfomance;
	private MBOPayout mboPayout;
	
	@Autowired
	public MBOPayoutRepository mboPayoutRepository;
	
	@Autowired
	public PerfomanceService perfomanceService;
	
	final Logger logger = Logger.getLogger(MBOPayoutService.class);
	
	public MBOPayout getMBOPayout(Employee employee, int quarter, int year) {
		
		//getting employee perfomance in a given quarter and year
		perfomance = perfomanceService.getPerfomance(employee, quarter, year);
		logger.info("Perfomance info retrival....");
		logger.info("Perfomance Id: " + perfomance.getPerfomanceId());
		
		//getting mboPayout in that Perfomance ID
		mboPayout = mboPayoutRepository.getMBOPayout(perfomance.getPerfomanceId());
		mboPayout.setPerfomance(perfomance);
		logger.info("Mbo Payout retival....");
		logger.info("Payout Id: " + mboPayout.getMboPayoutId());
		return mboPayout;
		
	}
	
	
}
