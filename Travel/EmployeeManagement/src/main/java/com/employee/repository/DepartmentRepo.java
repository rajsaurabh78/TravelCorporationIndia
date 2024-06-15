package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.modal.Department;
@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer>{
	Department findByName(String name);
}
