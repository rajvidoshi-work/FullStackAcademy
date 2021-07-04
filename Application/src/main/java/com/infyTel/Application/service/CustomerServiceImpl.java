package com.infyTel.Application.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infyTel.Application.domain.Customer;
import com.infyTel.Application.dto.CustomerDTO;
import com.infyTel.Application.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
	  @Autowired
	  private CustomerRepository  repository; 
	  
	public void insertCustomer(CustomerDTO customer) {
		repository.saveAndFlush(CustomerDTO.prepareCustomerEntity(customer));
	}
	@Override
	public List<Customer> searchCustomer(String name, String address, Character gender, Integer age) {
		return repository.searchCustomer(name, address, gender, age);
	}
	
	
	
}
