package com.employee.modal;

import lombok.Data;

@Data
public class EmployeeDTO {
    private String empName;
    private String department;
    private Integer amount;
    private String currency;
    private String joiningDate;
    private String exitDate;
}