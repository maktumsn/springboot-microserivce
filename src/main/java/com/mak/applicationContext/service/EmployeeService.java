package com.mak.applicationContext.service;

import com.mak.applicationContext.model.Employee;
import com.mak.applicationContext.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;
    public List<Employee> getEmployees() {

        return employeeRepo.findAll();

    }
}
