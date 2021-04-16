package com.hms.Service;

import com.hms.Exception.UserNotFoundException;
import com.hms.Model.Employee;
import com.hms.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService (EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;

    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();

    }

    public Employee updateEmployee (Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee findEmployeeById(int id) {
        return employeeRepository.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteEmployee (int id){
        employeeRepository.deleteEmployeeById(id);

    }
}
