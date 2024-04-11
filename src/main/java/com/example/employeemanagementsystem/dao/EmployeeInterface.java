package com.example.employeemanagementsystem.dao;

import com.example.employeemanagementsystem.entity.Employee;

import java.util.List;

public interface EmployeeInterface {
    void save(Employee employee);
    Employee findById(Integer id);
    List<Employee> findAll();
}
