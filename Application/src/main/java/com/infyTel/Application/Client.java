package com.infyTel.Application;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.infyTel.Application.domain.Customer;
import com.infyTel.Application.dto.CustomerDTO;
import com.infyTel.Application.service.CustomerService;

@SpringBootApplication
public class Client implements CommandLineRunner {
	static Logger logger = Logger.getLogger(Client.class);
	@Autowired
	ApplicationContext context;
	@Autowired
	CustomerService service;
	public static void main(String[] args) {
		SpringApplication.run(Client.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		CustomerDTO customer1 = new CustomerDTO(7022713754L, "Adam", 27, 'M', "Chicago", 1);
		CustomerDTO customer2 = new CustomerDTO(7022713744L, "Susan", 25, 'F', "Alberta", 2);
		CustomerDTO customer3 = new CustomerDTO(7022713745L, "Andrew", 27, 'M', "Chicago", 2);
		// invoke service layer method to insert Customer
		service.insertCustomer(customer1);
		service.insertCustomer(customer2);
		service.insertCustomer(customer3);
		
		 List<Customer> cus1 = service.searchCustomer(null, null, 'F', null);
		 logger.info(cus1);
		 
		  List<Customer> cus2 = service.searchCustomer("Adam", null, 'M', null);
		  logger.info(cus2);
		
		  List<Customer> cus3 = service.searchCustomer(null, null,null , 27);
		  logger.info(cus3);
		  
		 List<Customer> cus4 = service.searchCustomer("Susan","Alberta",null, null);
		 logger.info(cus4);
		
	}
}
