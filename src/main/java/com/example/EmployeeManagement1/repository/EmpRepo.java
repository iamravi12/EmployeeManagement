package com.example.EmployeeManagement1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeManagement1.entity.Employee;


@Repository
public interface EmpRepo  extends JpaRepository<Employee , Integer>{

}
