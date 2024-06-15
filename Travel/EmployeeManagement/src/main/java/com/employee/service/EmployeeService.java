package com.employee.service;

import java.time.LocalDate;
import java.util.List;

import com.employee.exception.DepartmentException;
import com.employee.exception.EmployeeException;
import com.employee.modal.Employee;
import com.employee.modal.EmployeeDTO;

public interface EmployeeService {
	public String addEmployee(List<EmployeeDTO> empList)throws EmployeeException,DepartmentException;
	public Object findEligibleEmployees(String date)throws EmployeeException;
}

