package com.hms.Repository;

import com.hms.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository <Employee, Integer>{
    void deleteEmployeeById(int id);

    Optional<Employee> findEmployeeById(int id);
}
