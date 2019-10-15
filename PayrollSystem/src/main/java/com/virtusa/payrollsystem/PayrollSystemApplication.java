package com.virtusa.payrollsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan( basePackages = {"com.virtusa.payrollsystem.*"} )
@EnableAutoConfiguration
@EnableJpaRepositories( basePackages = {"com.virtusa.payrollsystem.*"} )
@EntityScan( basePackages = {"com.virtusa.payrollsystem.*"} )
public class PayrollSystemApplication{
	
	public static void main(String[] args) {
		
		SpringApplication.run(PayrollSystemApplication.class, args);

	}


}
