package com.example.crm.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.crm.model.Employee;
import com.example.crm.model.Magazin;
import com.example.crm.model.Schedule;
import com.example.crm.model.Service;
import com.example.crm.repository.EmployeeRepository;
import com.example.crm.repository.ScheduleRepository;
import com.example.crm.repository.ServiceRepository;

import view.EmployeeSchedule;

@Controller
public class EmployerController {
	@Autowired
	private ServiceRepository serviceRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private ScheduleRepository scheduleRepository;

	@RequestMapping("/employers")
	public String employers(Model model, EmployeeSchedule view) {
		List<EmployeeSchedule> employee = new ArrayList<EmployeeSchedule>();
		Collection<Schedule> collection = (Collection<Schedule>) scheduleRepository.findAll();
		Set<Long> employeeIds = new HashSet<>();
		for (Schedule schedule : collection) {
			EmployeeSchedule employeeSchedule = new EmployeeSchedule();
			if (schedule.getEmployeeServiceId() != null && schedule.getServiceId() != null) {
				Long employeeId = schedule.getEmployeeServiceId();
				if (!employeeIds.contains(employeeId)) {
					employeeSchedule.setEmployee(employeeRepository.findById(schedule.getEmployeeServiceId()).get());
					employeeSchedule.setService(serviceRepository.findById(schedule.getServiceId()).get());
					employeeIds.add(employeeId);
					employee.add(employeeSchedule);
					
				}

			}
		}
		model.addAttribute("table_inf", employee);
//		model.addAttribute("employers", employeeRepository.findAll());
		model.addAttribute("services", serviceRepository.findAll());
//		
//		view.setEmployee(new Employee());
		view.setService(new Service());
		model.addAttribute("employer_new", view);
		return "employers";
	}

	@PostMapping("/employers.save")
	public String employersSave(@Valid@ModelAttribute("employer_new") EmployeeSchedule view, BindingResult result,
			Model model) {/// проверки
		Schedule schedule = new Schedule();
		Employee employee = view.getEmployee();
		Service service = view.getService();
		
		if (result.hasErrors()) {
			model.addAttribute("employers", employeeRepository.findAll());
			model.addAttribute("services", serviceRepository.findAll());
			return "employers";// сделать ошибку о вводе
		}
		employeeRepository.save(employee);
		//schedule.setId(1L);
		schedule.setEmployeeServiceId(employee.getId());
		schedule.setServiceId(service.getId());
		scheduleRepository.save(schedule);
		return "redirect:/employers";
	}

	@GetMapping("/employers.delete")
	public String employersDelete(@RequestParam("id") Long employersId) {
		employeeRepository.deleteById(employersId);
		return "redirect:/employers";
	}

	@GetMapping("/employers.edit")
	public ModelAndView serviceEdit(@RequestParam("id") Long employersId, @RequestParam("serviceId") Long serviceId) {
		ModelAndView mav = new ModelAndView("employers");
		EmployeeSchedule schedule = new EmployeeSchedule();
		schedule.setEmployee(employeeRepository.findById(employersId).get());
		schedule.setService(serviceRepository.findById(serviceId).get());
		mav.addObject("employer_new", schedule);
		mav.addObject("services", serviceRepository.findAll());
		return mav;
	}
}
