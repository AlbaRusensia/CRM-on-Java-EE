package com.example.crm.controller;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.crm.model.Customer;
import com.example.crm.model.CustomerEmail;
import com.example.crm.model.EmployeeEmail;
import com.example.crm.repository.CustomerRepository;
import com.example.crm.repository.EmployeeRepository;

@Controller
public class EmailController {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private JavaMailSender sender;

	@GetMapping("/customer.email")
	public ModelAndView customerEmail(@RequestParam("id") Long customerId) {
		ModelAndView mav = new ModelAndView("email");
		CustomerEmail customerEmail = new CustomerEmail();
		customerEmail.setCustomer(customerRepository.findById(customerId).get());
		mav.addObject("customer_new", customerEmail);
		return mav;
	}

	@PostMapping("/customer.email.sent")
	public ModelAndView customerEmailSent(@ModelAttribute("customer_new") CustomerEmail customer) {
		ModelAndView mav = new ModelAndView("email");
		//mav.addObject("customer_new", customerRepository.findById(customerId).get());
		try {
			sendEmail(customer);
		} catch (Exception exception) {
			System.out.println("Exception while sending an email");
			exception.printStackTrace();
		}
		return mav;
	}

	@GetMapping("/employee.email")
	public ModelAndView employeeEmail(@RequestParam("id") Long employeeId) {
		
		ModelAndView mav = new ModelAndView("employee-email");
		EmployeeEmail employee = new EmployeeEmail();
		employee.setEmployee(employeeRepository.findById(employeeId).get());
		
		mav.addObject("employer_new", employee);
		return mav;
	}
	
	@PostMapping("/employee.email.sent")
	public ModelAndView employeeEmailSent(@ModelAttribute("employer_new") EmployeeEmail employee) {
		ModelAndView mav = new ModelAndView("employee-email");
		//mav.addObject("customer_new", customerRepository.findById(customerId).get());
		try {
			sendEmail(employee);
		} catch (Exception exception) {
			System.out.println("Exception while sending an email");
			exception.printStackTrace();
		}
		return mav;
	}

	private void sendEmail(CustomerEmail customer) throws Exception {
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		helper.setTo(customer.getCustomer().getEmail());
		helper.setText(customer.getMessage());
		helper.setSubject("Сообщение от Mirasov");

		sender.send(message);
	}
	
	private void sendEmail(EmployeeEmail employee) throws Exception {
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		helper.setTo(employee.getEmployee().getEmail());
		helper.setText(employee.getMessage());
		helper.setSubject("Сообщение от Mirasov");

		sender.send(message);
	}
}
