package com.example.crm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.crm.model.Employee;
import com.example.crm.model.Schedule;
import com.example.crm.repository.EmployeeRepository;
import com.example.crm.repository.ScheduleRepository;
import com.google.gson.Gson;

@Controller
public class GsonController {
//	@Autowired
//	private ServiceRepositoryForGson serviceRepositoryForGson;
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private ScheduleRepository scheduleRepository;

	@GetMapping("/magazin/chage")
	public void magazinChage(HttpServletRequest request, HttpServletResponse response) {
		Long serviceName = Long.parseLong(request.getParameter("serviceName"));
		String json = null;

		List<Employee> empList = new ArrayList<>();

		List<Schedule> schedules = scheduleRepository.findByServiceId(serviceName);

		for (Schedule schedule : schedules) {
			empList.add(employeeRepository.findById(schedule.getEmployeeServiceId()).get());
		}
		
		json = new Gson().toJson(empList);
		response.setContentType("application/json");
		try {
			response.getWriter().write(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
