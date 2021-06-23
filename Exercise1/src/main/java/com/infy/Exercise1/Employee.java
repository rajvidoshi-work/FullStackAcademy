package com.infy.Exercise1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.infy.Exercise1.util.SpringConfiguration;

public class Employee {
	public static void main(String args[]) {
		EmployeeServiceImpl service = null;
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		service = (EmployeeServiceImpl) context.getBean("employeeService");
		System.out.println(service.insert(EmployeeDTO));
		context.close();
	}

}
