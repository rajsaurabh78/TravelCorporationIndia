package com.employee.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.modal.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	List<Employee> findByJoiningDateBeforeAndExitDateAfter(LocalDate date, LocalDate date2);
}
