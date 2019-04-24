package com.example.crm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.example.crm.model.Schedule;

public interface ScheduleRepository  extends CrudRepository<Schedule, Long>{
	public List<Schedule> findByServiceIdAndEmployeeServiceId(Long serviceId,Long employeeServiceId);
	public List<Schedule> findByServiceId(Long serviceId);

}
