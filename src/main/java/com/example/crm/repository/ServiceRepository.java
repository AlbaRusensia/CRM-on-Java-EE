package com.example.crm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.crm.model.Service;

@Repository
public interface ServiceRepository extends CrudRepository<Service, Long> {
	public List<Service> findByServiceNameAndPrice(String serviceName, Float price);



}
