package com.infy.Exercise1;

public class EmployeeServiceImpl implements EmployeeService {

		@Override
		public void insert(EmployeeDTO emp) {
			System.out.println("inserted");
		}
		
		@Override
		public void delete(int empId) {
			System.out.println("deleted");
		}
}
