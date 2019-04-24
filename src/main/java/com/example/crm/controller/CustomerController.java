package com.example.crm.controller;

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

import com.example.crm.model.Customer;
import com.example.crm.repository.CustomerRepository;

@Controller
public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;

	@RequestMapping("/customer")
	public String customer(Model model) {
		model.addAttribute("customers", customerRepository.findAll());
		model.addAttribute("customer_new", new Customer());
		return "customer";
	}

	@PostMapping("/customer.save")
	public String customerSave(@ModelAttribute("customer_new") Customer customer,BindingResult result, Model model) {
//		if (result.hasErrors()) {
//			model.addAttribute("customers", customerRepository.findAll());
//			return "customer";// сделать ошибку о вводе
//		}
		customerRepository.save(customer);
		return "redirect:/customer";
	}
	
	@GetMapping("/customer.edit")
	public ModelAndView serviceEdit(@RequestParam("id") Long customerId) {
		ModelAndView mav = new ModelAndView("customer");
		mav.addObject("customer_new", customerRepository.findById(customerId).get());
		return mav;
	}
	
	@GetMapping("/customer.delete")
	public String customerDelete(@RequestParam("id") Long customerId) {
		customerRepository.deleteById(customerId);
		return "redirect:/customer";
	}
	
	
}
