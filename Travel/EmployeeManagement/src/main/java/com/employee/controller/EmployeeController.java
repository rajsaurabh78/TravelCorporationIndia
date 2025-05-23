package com.employee.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.modal.Employee;
import com.employee.modal.EmployeeDTO;
import com.employee.modal.EmployeesDto;
import com.employee.service.EmployeeService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/tci")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employee-bonus")
	public ResponseEntity<String> addEmployeeController(@Valid @RequestBody EmployeesDto employees){
		List<EmployeeDTO> empList=employees.getEmployees();
		String emps=employeeService.addEmployee(empList);
		return new ResponseEntity<>(emps, HttpStatus.CREATED);
	}
	
	@GetMapping("/employee-bonus")
	public Object findEligibleEmployeesController(@RequestParam("date") String date) {
		
		Object emps=employeeService.findEligibleEmployees(date);
		return new ResponseEntity<>(emps, HttpStatus.OK);
	}
	

}
