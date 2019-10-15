package com.virtusa.payrollsystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.virtusa.payrollsystem.models.Login;
import com.virtusa.payrollsystem.repositories.LoginRepository;

@Service
public class LoginService {
		
		@Autowired
		private LoginRepository loginRepository;
		
		public Login getLogin(int employeId) {
			return loginRepository.getLogin(employeId);
		}
		
		public int reset(int employeId, String currentPassword, String newPassword) {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();  
			
			//Encrypt given new password
			String newPasswd = new BCryptPasswordEncoder().encode(newPassword);
			
			//Checking the credentials
			if(encoder.matches(currentPassword, loginRepository.getLogin(employeId).getPassword())) {
				return loginRepository.reset(employeId, newPasswd);
			}
			
			return 0;
			
		}
}
