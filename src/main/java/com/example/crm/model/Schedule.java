package com.example.crm.model;

import java.time.LocalDateTime;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "schedule")
@AssociationOverrides({ @AssociationOverride(name = "serviceId", joinColumns = @JoinColumn(name = "service_id")),
		@AssociationOverride(name = "employeeServiceId", joinColumns = @JoinColumn(name = "employee_id")) })
public class Schedule {// связь многие ко многим
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "time_id", unique = true, nullable = false)
	private Long id;
//	@DateTimeFormat(iso = ISO.DATE_TIME)
//	@Column(name = "date",columnDefinition="TIMESTAMP")
//	private LocalDateTime dateTime;
	private Long serviceId;
	@JoinColumn(name = "employee_service_id",nullable = true)
	private Long employeeServiceId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public LocalDateTime getDateTime() {
//		return dateTime;
//	}
//
//	public void setDateTime(LocalDateTime dateTime) {
//		this.dateTime = dateTime;
//	}

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public Long getEmployeeServiceId() {
		return employeeServiceId;
	}

	public void setEmployeeServiceId(Long employeeServiceId) {
		this.employeeServiceId = employeeServiceId;
	}

}
