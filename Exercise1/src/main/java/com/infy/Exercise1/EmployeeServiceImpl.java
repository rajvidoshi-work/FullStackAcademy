package com.infy.Exercise1;

import java.util.List;
import com.infy.Exercise1.EmployeeDTO;


public class EmployeeServiceImpl implements EmployeeService {

		@Override
		public String createEmployee(EmployeeDTO employeeDTO) {
			return "Employee created with Empid: " + employeeDTO.getEmpId();
			}
		
		@Override
		public void deleteEmployee(int empId) {
			System.out.println("deleted");
		}

		@Override
		public List<EmployeeDTO> getAllEmployees() {
			// TODO Auto-generated method stub
			return null;
		}
}
