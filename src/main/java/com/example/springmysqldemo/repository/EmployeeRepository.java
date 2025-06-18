package com.example.springmysqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springmysqldemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
