package com.infyTel.Application.service;
import java.util.List;
import com.infyTel.Application.domain.Customer;
import com.infyTel.Application.dto.CustomerDTO;
public interface CustomerService {
	public void insertCustomer(CustomerDTO Customer) ;
	public List<Customer> searchCustomer(String name, String address, Character gender, Integer age) ;
}
