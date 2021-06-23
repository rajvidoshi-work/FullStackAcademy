package com.infy.Exercise1.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infy.Exercise1.EmployeeServiceImpl;

@Configuration
public class SpringConfiguration {
	@Bean (name = "employeeService")
	public EmployeeServiceImpl employeeServiceImpl() {
		return new EmployeeServiceImpl();
	}

}
