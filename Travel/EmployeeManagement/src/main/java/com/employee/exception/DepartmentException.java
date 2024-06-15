package com.employee.exception;

public class DepartmentException extends RuntimeException{
	public DepartmentException() {
	}
	public DepartmentException(String msg) {
		super(msg);
	}
}
