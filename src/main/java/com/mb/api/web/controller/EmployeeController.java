package com.mb.api.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mb.api.business.exception.EmployeeNotFoundException;
import com.mb.api.web.model.Employee;
//
//@RestController
//@RequestMapping("/api/v1/employees")
//public class EmployeeController
//{
//	@GetMapping("/{id}")
//	public ResponseEntity<Employee> getEmployee(@PathVariable Integer id)
//	{
//
//		if (id != 5)
//		{
//			throw new EmployeeNotFoundException("Employee Not found !");
//		}
//
//		return new ResponseEntity<>(new Employee(10, "Sachin", 363535.635), HttpStatus.OK);
//	}
//}




























