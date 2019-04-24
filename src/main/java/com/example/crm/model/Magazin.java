package com.example.crm.model;

import java.time.LocalDateTime;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "magazin")
@AssociationOverrides({ @AssociationOverride(name = "customerId", joinColumns = @JoinColumn(name = "customer_id")),
		@AssociationOverride(name = "employeeId", joinColumns = @JoinColumn(name = "employee_id")) })
public class Magazin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "magazin_id", unique = true, nullable = false)
	private Long id;
	@Column(name = "treatment")
	private Boolean treatment;
	private Long customerId;
	@Column(name = "employee_id", nullable = true)
	private Long employeeId;
	@OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
	@JoinColumn(name = "service_id")
	private Service service;
//	@OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
//	@JoinColumn(name = "time_id",nullable = true)
//	private Schedule schedule;
	@DateTimeFormat(iso = ISO.DATE_TIME)
	@Column(name = "date",columnDefinition="TIMESTAMP")
	private LocalDateTime dateTime;


	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

//	public Schedule getSchedule() {
//		return schedule;
//	}
//
//	public void setSchedule(Schedule schedule) {
//		this.schedule = schedule;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getTreatment() {
		return treatment;
	}

	public void setTreatment(Boolean treatment) {
		this.treatment = treatment;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		//result = prime * result + ((schedule == null) ? 0 : schedule.hashCode());
		result = prime * result + ((service == null) ? 0 : service.hashCode());
		result = prime * result + ((treatment == null) ? 0 : treatment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Magazin other = (Magazin) obj;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
//		if (schedule == null) {
//			if (other.schedule != null)
//				return false;
//		} else if (!schedule.equals(other.schedule))
//			return false;
		if (service == null) {
			if (other.service != null)
				return false;
		} else if (!service.equals(other.service))
			return false;
		if (treatment == null) {
			if (other.treatment != null)
				return false;
		} else if (!treatment.equals(other.treatment))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Magazin [id=" + id + ", treatment=" + treatment + ", customerId=" + customerId + ", employeeId="
				+ employeeId + ", service=" + service + "]";
	}

	

}
