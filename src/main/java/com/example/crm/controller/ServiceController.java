package com.example.crm.controller;

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

import com.example.crm.model.Service;
import com.example.crm.repository.ServiceRepository;

@Controller
public class ServiceController {
	@Autowired
	private ServiceRepository serviceRepository;

	@RequestMapping("/services")
	public String service(Model model) {
		model.addAttribute("services", serviceRepository.findAll());
		model.addAttribute("service_new", new Service());
		return "services";
	}

	@PostMapping("/services.save")
	public String serviceSave(@Valid@ModelAttribute("service_new") Service service, BindingResult result ,Model model) {
		if (result.hasErrors()) {
			model.addAttribute("services", serviceRepository.findAll());
			return "services";// сделать ошибку о вводе
		}
		serviceRepository.save(service);
		return "redirect:/services";
	}

	@GetMapping("/services.delete")
	public String serviceDelete(@RequestParam("id") Long serviceId) {
		serviceRepository.deleteById(serviceId);
		return "redirect:/services";
	}

	@GetMapping("/services.edit")
	public ModelAndView serviceEdit(@RequestParam("id") Long serviceId) {
		ModelAndView mav = new ModelAndView("services");
		mav.addObject("service_new", serviceRepository.findById(serviceId).get());
		return mav;
	}

}
