package com.oscarwarr.alurabooks.backend.service;

import com.oscarwarr.alurabooks.backend.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long EmployeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long EmployeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long EmployeeId);
}
