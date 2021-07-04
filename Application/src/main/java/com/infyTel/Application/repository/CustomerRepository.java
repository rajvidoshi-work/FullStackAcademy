package com.infyTel.Application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infyTel.Application.domain.Customer;
public interface CustomerRepository extends JpaRepository<Customer, Long>,ICustomerRepository{
	
}
