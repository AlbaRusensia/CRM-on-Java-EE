package com.example.crm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import com.example.crm.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	public List<Employee> findByFirstNameAndNumberPhone(String firstName, String numberPhone);
	public Optional<Employee> findById(Long id);
	
}
