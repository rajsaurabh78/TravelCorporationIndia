package com.employee.modal;

import java.util.List;

import jakarta.validation.constraints.NotNull;

public class EmployeesDto {
    @NotNull
    private List<EmployeeDTO> employees;

    public EmployeesDto() {}

    public EmployeesDto(List<EmployeeDTO> employees) {
        this.employees = employees;
    }

    public List<EmployeeDTO> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeDTO> employees) {
        this.employees = employees;
    }
}