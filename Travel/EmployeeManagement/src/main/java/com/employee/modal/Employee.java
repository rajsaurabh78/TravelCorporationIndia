package com.employee.modal;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	@Column(nullable = false)
    private String empName;
    private String currency;
    private Integer amount;
    @Column(nullable = false)
    private LocalDate joiningDate;
    private LocalDate exitDate;
    
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

}