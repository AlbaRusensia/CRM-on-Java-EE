package com.example.crm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.crm.model.Service;

public interface ServiceRepositoryForGson extends CrudRepository<Service, Long> {
	public Optional<Service> findById(Long id);
}
