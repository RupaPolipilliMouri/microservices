package com.mouritech.microservicesexample.departmentmanagement.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.microservicesexample.departmentmanagement.service.DepartmentService;
import com.mouritech.microservicesexample.departmentmanagement.domain.Department;



@RestController
@RequestMapping(value = "/")
public class DepartmentController {
	
	@Autowired
	private DepartmentService deptService;
	
	@PostMapping
	public void addDepartment(@RequestBody Department dept) {
		deptService.addDepartment(dept);
	}
	
	@GetMapping
	public List<Department> getDepartments() {

		return deptService.getDepartments();
	}
}