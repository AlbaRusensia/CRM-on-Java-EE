package com.example.crm.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.crm.model.Customer;
import com.example.crm.model.Service;
import com.example.crm.repository.ServiceRepository;



import view.MagazineViewMain;

@Controller
public class CrmController {
	@Autowired
	private ServiceRepository serviceRepository;
	
	@RequestMapping("/")
	public String start(Model model) {
		model.addAttribute("services", serviceRepository.findAll());
		MagazineViewMain view = new MagazineViewMain();
		view.setCustomer(new Customer());
		view.setService(new Service());
		model.addAttribute("view", view);
		return "index";
	}

	@GetMapping("/home")
	public String home() {
		return "home";
	}
	


	@PostConstruct
	public void saveServace() {
		Service service = new Service();
		service.setServiceName("Парикмахерский сервис");
		service.setPrice(10.00);
		Service service2 = new Service();
		service2.setServiceName("Косметологический сервис");
		service2.setPrice(20.00);
		Service service3 = new Service();
		service3.setServiceName("Маникюрный сервис");
		service3.setPrice(20.00);
		Service service4 = new Service();
		service4.setServiceName("Массаж и SPA");
		service4.setPrice(40.00);
		Service service5 = new Service();
		service5.setServiceName("Солярий");
		service5.setPrice(5.00);
		serviceRepository.save(service);
		serviceRepository.save(service2);
		serviceRepository.save(service3);
		serviceRepository.save(service4);
		serviceRepository.save(service5);
//		Customer customer = new Customer();
//		customer.setFirstName("sdfsdf");
//		customerRepository.save(customer);
//		Magazin magazin = new  Magazin();
//		magazin.setCustomerId(customer.getId());
//		magazinRespository.save(magazin);

	}
}
