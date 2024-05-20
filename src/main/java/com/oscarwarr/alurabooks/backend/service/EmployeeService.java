package com.oscarwarr.alurabooks.backend.service;

import com.oscarwarr.alurabooks.backend.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long EmployeeId);
}
