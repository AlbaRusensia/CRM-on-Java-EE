package com.example.crm.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.crm.model.Magazin;





public interface MagazinRespository extends CrudRepository<Magazin, Long>{
	public List<Magazin> findByCustomerIdAndServiceId(Long customerId,Long serviceId);
	
	
}
