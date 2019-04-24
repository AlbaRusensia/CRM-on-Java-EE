package view;

import javax.validation.Valid;

import com.example.crm.model.Employee;
import com.example.crm.model.Service;

public class EmployeeSchedule {
	@Valid
	private Employee employee;
	@Valid
	private Service service;

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	
	

}
