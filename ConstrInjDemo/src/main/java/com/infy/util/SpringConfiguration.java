package com.infy.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.infy.repository.CustomerRepository;
import com.infy.service.CustomerServiceImpl;

@Configuration
public class SpringConfiguration {
	
	@Bean
	public CustomerServiceImpl customerService() {
		return new CustomerServiceImpl(customerRepository(), 20);
	}
	
	@Bean
	public CustomerRepository customerRepository() {
		return new CustomerRepository();
	}

}
