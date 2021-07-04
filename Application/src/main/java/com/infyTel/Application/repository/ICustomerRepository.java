package com.infyTel.Application.repository;

import java.util.List;
import com.infyTel.Application.domain.Customer;
public interface ICustomerRepository {
	public List<Customer> searchCustomer(String name, String addr, Character gender, Integer age);
}
