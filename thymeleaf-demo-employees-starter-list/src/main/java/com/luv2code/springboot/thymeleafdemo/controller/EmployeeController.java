package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import com.luv2code.springboot.thymeleafdemo.service.EmployeeService;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/employees")
public class EmployeeController {

	// load employee data

	private EmployeeService employeeService;
	public EmployeeController( EmployeeService theEmployeeService){
		this.employeeService=theEmployeeService;
	}
	// add mapping for "/list"

	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		List<Employee> theEmployees=employeeService.findAll();
		// add to the spring model
		theModel.addAttribute("employees", theEmployees);

		return "employees/list-employees";
	}
	@GetMapping("/showAddForm")
	public String add(Model thModel){
		Employee theEmployee= new Employee();
		thModel.addAttribute("employee",theEmployee);
		return "employees/employee-form";
	}
	@GetMapping("showUpdateForm")
	public String update(@RequestParam("employeeId") int theId,Model thModel){
		Employee thEmployee=employeeService.findById(theId);
		thModel.addAttribute(thEmployee);
		return "/employees/employee-form";
	}
	@PostMapping("/save")
	public String save(@ModelAttribute Employee thEmployee) {
		employeeService.save(thEmployee);
		return "redirect:/employees/list";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId") int id,Model thModel) {
		employeeService.deleteById(id);
		return "redirect:/employees/list";
	}
	
}









