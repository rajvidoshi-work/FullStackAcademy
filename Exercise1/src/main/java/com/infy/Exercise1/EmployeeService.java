package com.infy.Exercise1;

import com.infy.Exercise1.EmployeeDTO;
import java.util.List;

public interface EmployeeService {
	
	public String createEmployee(EmployeeDTO employeeDTO);
	public void deleteEmployee(int empId);
	
	public List<EmployeeDTO> getAllEmployees();

}
