package view;

import com.example.crm.model.Customer;
import com.example.crm.model.Employee;
import com.example.crm.model.Magazin;
import com.example.crm.model.Schedule;
import com.example.crm.model.Service;

public class MagazineView {
	private Magazin magazin;
	private Customer customer;
	private Service service;
	private Schedule schedule;
	private Employee employee;

	public Magazin getMagazin() {
		return magazin;
	}

	public void setMagazin(Magazin magazin) {
		this.magazin = magazin;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

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

}
