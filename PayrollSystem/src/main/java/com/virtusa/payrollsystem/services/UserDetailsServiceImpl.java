package com.virtusa.payrollsystem.services;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.virtusa.payrollsystem.models.Login;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private LoginService loginService;
	
	final Logger logger = Logger.getLogger(UserDetailsServiceImpl.class);

	@Transactional(readOnly = true)

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Login login = this.loginService.getLogin(Integer.parseInt(username));

		UserBuilder builder = null;
		if (login != null) {

			builder = org.springframework.security.core.userdetails.User.withUsername(username);

			builder.password(login.getPassword());
			String[] authorities = { "USER_ROLE" };
			builder.authorities(authorities);
			
			logger.info("Logged user: " + username);
		} else {
			logger.info("User not found.");
			throw new UsernameNotFoundException("User not found.");
		}
		return builder.build();

	}

}
