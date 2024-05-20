package com.oscarwarr.alurabooks.backend.repository;

import com.oscarwarr.alurabooks.backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
