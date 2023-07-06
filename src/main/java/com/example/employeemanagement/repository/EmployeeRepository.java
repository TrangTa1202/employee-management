package com.example.employeemanagement.repository;

import com.example.employeemanagement.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//add Repository annotation to confirm that it is a repository
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    //extends JpaRepository for using JPA Repository
}
