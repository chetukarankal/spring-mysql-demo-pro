package com.example.springmysqldemo.controller;

import com.example.springmysqldemo.model.Employee;
import com.example.springmysqldemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Employee save(@RequestBody Employee emp) {
        return service.save(emp);
    }
}