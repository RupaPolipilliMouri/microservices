package com.mouritech.microservicesexample.departmentmanagement.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.microservicesexample.departmentmanagement.domain.Department;
import com.mouritech.microservicesexample.departmentment.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository deptRepo;

	@Override
	public void addDepartment(Department dept) {
		deptRepo.save(dept);
		
	}

	@Override
	public List<Department> getDepartments() {

		return deptRepo.findAll();
	}

}