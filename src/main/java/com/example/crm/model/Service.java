package com.example.crm.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "service")
public class Service {// сделать связь с услугами многие ко многим (таблица график)в ней будут доп
						// (связь через работника)

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "service_id", unique = true, nullable = false)
	private Long id;
	@Column(name = "service_name")
	@NotBlank(message="Наименование должно быть заполнено.")
	private String serviceName;
//	@NotBlank(message="Цена должна быть указана.")
	@Column(name = "price")
	private Double price;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "serviceId", cascade = CascadeType.ALL)
	private Set<Schedule> schedule = new HashSet<Schedule>(0);
 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(double d) {
		this.price = d;
	}
	public Set<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(Set<Schedule> schedule) {
		this.schedule = schedule;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((serviceName == null) ? 0 : serviceName.hashCode());
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
		Service other = (Service) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (serviceName == null) {
			if (other.serviceName != null)
				return false;
		} else if (!serviceName.equals(other.serviceName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Service [id=" + id + ", serviceName=" + serviceName + ", price=" + price + "]";
	}

}
