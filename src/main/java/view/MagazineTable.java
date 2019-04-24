package view;

import com.example.crm.model.Customer;
import com.example.crm.model.Employee;
import com.example.crm.model.Magazin;
import com.example.crm.model.Schedule;
import com.example.crm.model.Service;

public class MagazineTable {
	private Customer customer;
	private Service service;
	private Schedule schedule;
	private Employee employee;
	private Magazin magazin;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Magazin getMagazin() {
		return magazin;
	}

	public void setMagazin(Magazin magazin) {
		this.magazin = magazin;
	}
}
