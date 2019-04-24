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
@Table(name = "customer")
public class Customer {// сделать связь с работниками многие ко многим (таблица заявки) в ней будут доп
						// колонки дата
						// посещений и лог колонка обрадотана ли заявка или нет
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id", unique = true, nullable = false)
	private Long id;
	@Column(name = "first_name", length = 256)
	/* @NotBlank(message="Ф.И.О. должно быть заполнено.") */
	private String firstName;
//	@Pattern(regexp="[0-9]*",message="Введите номер телефона")
	@Column(name = "number_phone")
	private String numberPhone;
	@Column(name = "email")
	private String email;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customerId", cascade = CascadeType.ALL)
	private Set<Magazin> magazins = new HashSet<Magazin>(0);

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

	public Set<Magazin> getMagazins() {
		return magazins;
	}

	public void setMagazins(Set<Magazin> magazins) {
		this.magazins = magazins;
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
		Customer other = (Customer) obj;
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

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ",+  numberPhone="
				+ numberPhone + ", email=" + email + "]";
	}

}
