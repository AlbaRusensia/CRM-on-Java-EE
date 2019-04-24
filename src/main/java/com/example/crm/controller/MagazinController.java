package com.example.crm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.crm.model.Customer;
import com.example.crm.model.Employee;
import com.example.crm.model.Magazin;
import com.example.crm.model.Schedule;
import com.example.crm.model.Service;
import com.example.crm.repository.CustomerRepository;
import com.example.crm.repository.EmployeeRepository;
import com.example.crm.repository.MagazinRespository;
import com.example.crm.repository.ScheduleRepository;
import com.example.crm.repository.ServiceRepository;
import com.example.crm.repository.ServiceRepositoryForGson;
import com.google.gson.Gson;

import view.EmployeeSchedule;
import view.MagazineTable;
import view.MagazineView;
import view.MagazineViewMain;

@Controller
public class MagazinController {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private MagazinRespository magazinRespository;
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private ServiceRepository serviceRepository;
	@Autowired
	private ScheduleRepository scheduleRepository;

	@PostMapping("/save.magazin")
	public String saveMagazin(@ModelAttribute("view") MagazineViewMain view, Model model) {
		Magazin magazin = new Magazin();
		Customer customer = view.getCustomer();
		Service service = view.getService();
		customerRepository.save(customer);
		magazin.setCustomerId(customer.getId());
		magazin.setService(service);
		//magazin.setCustomerId();
		magazin.setTreatment(false);
		magazinRespository.save(magazin);
		return "redirect:/";
	}

//	@GetMapping("/magazin.change")
//	public void magazinChage(HttpServletRequest request, HttpServletResponse response) {
//
//		String serviceName = request.getParameter("serviceName");
//		String json = null;
//
//		List<Service> serviceList = serviceRepositoryForGson.findByServiceName(serviceName);
//
//		json = new Gson().toJson(serviceList);
//		response.setContentType("application/json");
//		try {
//			response.getWriter().write(json);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	@RequestMapping("/magazin")
	public String magazin(Model model, MagazineView view) {
		List<MagazineTable> magazinTableList = new ArrayList<MagazineTable>();
		Collection<Magazin> collection = (Collection<Magazin>) magazinRespository.findAll();
		model.addAttribute("employees", employeeRepository.findAll());
		model.addAttribute("customers", customerRepository.findAll());
		model.addAttribute("services", serviceRepository.findAll());
		model.addAttribute("new_magazin", view);

		for (Magazin magazin : collection) {
			MagazineTable magazineTable = new MagazineTable();
			if (magazin != null) {
				magazineTable.setMagazin(magazin);
			}

			if (magazin.getService() != null) {
				magazineTable.setService(magazin.getService());
			}

			if (magazin.getCustomerId() != null) {
				magazineTable.setCustomer(customerRepository.findById(magazin.getCustomerId()).get());
			}

			if (magazin.getEmployeeId() != null) {
				magazineTable.setEmployee(employeeRepository.findById(magazin.getEmployeeId()).get());
			}
//			if (magazin.getSchedule() != null) {
//				magazineTable.setSchedule(magazin.getSchedule());
//			}

			magazinTableList.add(magazineTable);
		}
		model.addAttribute("table_inf", magazinTableList);
		return "magazin";
	}

	@PostMapping("/save.new_magazin")
	public String saveNewMagazin(@ModelAttribute("new_magazin") MagazineView view, Model model) {
		Magazin magazin = view.getMagazin();
		Customer customer = view.getCustomer();
		Service service = view.getService();
		Employee employee = view.getEmployee();
		//Schedule schedule = view.getSchedule();
		customerRepository.save(customer);
		magazin.setCustomerId(customer.getId());
		magazin.setService(service);
		magazin.setEmployeeId(employee.getId());

		//magazin.setSchedule(schedule);
		magazinRespository.save(magazin);
		return "redirect:/magazin";
	}

	@GetMapping("/magazin.delete")
	public String employersDelete(@RequestParam("id") Long magazinId) {
		magazinRespository.deleteById(magazinId);
		return "redirect:/magazin";
	}

	@GetMapping("/magazin.edit")
	public ModelAndView serviceEdit(@RequestParam("serviceId") Long serviceId,
			@RequestParam("customerId") Long customerId,@RequestParam("magazinId") Long magazinId) {
		ModelAndView mav = new ModelAndView("magazin");
		MagazineTable magazin = new MagazineTable();
		//magazin.setEmployee(employeeRepository.findById(employersId).get());
		magazin.setService(serviceRepository.findById(serviceId).get());
		magazin.setCustomer(customerRepository.findById(customerId).get());
		//magazin.setSchedule(scheduleRepository.findById(scheduleId).get());
		magazin.setMagazin(magazinRespository.findById(magazinId).get());
		mav.addObject("new_magazin", magazin);
		mav.addObject("services", serviceRepository.findAll());
		mav.addObject("customers", customerRepository.findAll());
		mav.addObject("employees", employeeRepository.findAll());
		return mav;
	}
}
