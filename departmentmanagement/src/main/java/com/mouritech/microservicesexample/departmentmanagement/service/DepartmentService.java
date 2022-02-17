package com.mouritech.microservicesexample.departmentmanagement.service;

import java.util.List;

import com.mouritech.microservicesexample.departmentmanagement.domain.Department;

public interface DepartmentService {
	
	void addDepartment(Department dept);
	List<Department> getDepartments();

}