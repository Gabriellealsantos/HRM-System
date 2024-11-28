package com.inovals.HRMSystem.services;

import com.inovals.HRMSystem.dto.EmployeeDTO;
import com.inovals.HRMSystem.entities.Employee;
import com.inovals.HRMSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional(readOnly = true)
    public EmployeeDTO findById(Long id) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        return new EmployeeDTO(employee);
    }
}
