package com.example.crm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.crm.model.Customer;



public interface CustomerRepository extends CrudRepository<Customer, Long> {
	public List<Customer> findByFirstNameAndNumberPhone(String firstName, String numberPhone);
}
