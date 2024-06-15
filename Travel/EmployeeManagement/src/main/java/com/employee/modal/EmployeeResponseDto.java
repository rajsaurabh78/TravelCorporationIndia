package com.employee.modal;

import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
public class EmployeeResponseDto {
	private String errorMessage;
    private List<Map<String, Object>> data;
}
