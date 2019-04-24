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
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "employee")
public class Employee {// сделать связь с услугами многие ко многим (таблица график)в ней будут доп
						// колонка дата работ, сделать связь многие ко многим с журналом

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id", unique = true, nullable = false)
	private Long id;
	@Column(name = "first_name", length = 256)
	@NotBlank(message="Ф.И.О. должно быть заполнено.")
	private String firstName;
	@Column(name = "number_phone")
	@Pattern(regexp="[0-9]*",message="Введите номер телефона")
	private String numberPhone;
	@Column(name = "email")
	private String email;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employeeId", cascade = CascadeType.ALL)
	private Set<Magazin> magazins = new HashSet<Magazin>(0);
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employeeServiceId", cascade = CascadeType.ALL)
	private Set<Schedule> schedule = new HashSet<Schedule>(0);

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Set<Magazin> getMagazins() {
		return magazins;
	}

	public void setMagazins(Set<Magazin> magazins) {
		this.magazins = magazins;
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
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		
		result = prime * result + ((numberPhone == null) ? 0 : numberPhone.hashCode());
		
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
		Employee other = (Employee) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		
		if (numberPhone == null) {
			if (other.numberPhone != null)
				return false;
		} else if (!numberPhone.equals(other.numberPhone))
			return false;
		
		return true;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ",  numberPhone=" + numberPhone + ", email=" + email + "]";
	}

}
