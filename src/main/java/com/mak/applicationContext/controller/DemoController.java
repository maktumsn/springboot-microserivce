package com.mak.applicationContext.controller;

import com.mak.applicationContext.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    EmployeeService employeeService;
    @GetMapping("/")
    public ResponseEntity<?> getEmployees()
    {
        return ResponseEntity.ok(employeeService.getEmployees());
    }
}
