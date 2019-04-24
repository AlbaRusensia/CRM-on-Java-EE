package view;

import com.example.crm.model.Customer;
import com.example.crm.model.Service;

public class MagazineViewMain {
	private Customer customer;
	private Service service;
	
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
