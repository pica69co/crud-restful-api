package com.oscarwarr.alurabooks.backend.service.impl;

import com.oscarwarr.alurabooks.backend.dto.EmployeeDto;
import com.oscarwarr.alurabooks.backend.entity.Employee;
import com.oscarwarr.alurabooks.backend.exception.ResourceNotFoundException;
import com.oscarwarr.alurabooks.backend.mapper.EmployeeMapper;
import com.oscarwarr.alurabooks.backend.repository.EmployeeRepository;
import com.oscarwarr.alurabooks.backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
         Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long EmployeeId) {
    Employee employee=employeeRepository.findById(EmployeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found"));

        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
