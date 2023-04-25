package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.EmployeeSolr;
import com.spring.service1.EmpSolrService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/empl")
public class EmpSolrController{
@Autowired
private EmpSolrService empsolrservice;
	
	
	@PostMapping("/addEmployee")
	public ResponseEntity<String> addEmployee( @RequestBody EmployeeSolr employe) {
		System.out.println("Hello");
		return new ResponseEntity<String>(empsolrservice.create(employe),HttpStatus.CREATED);
	}

	

	@PostMapping("/createEmployees")
	public ResponseEntity<String> addEmployees (@Valid @RequestBody List<EmployeeSolr> employees) {
		return new ResponseEntity<String>(empsolrservice.createemployees(employees),HttpStatus.CREATED);
		
	}
//	
	@GetMapping("/employee/{empid}")
	public ResponseEntity<EmployeeSolr> getEmpById(@PathVariable int empid) {
		EmployeeSolr singleemploye= empsolrservice.getEmpById(empid);
		return new ResponseEntity<EmployeeSolr>(singleemploye,HttpStatus.OK); 
	}

	@GetMapping("/employees")
	public ResponseEntity<List<EmployeeSolr>>getAllEmployee() {
		return new ResponseEntity<List<EmployeeSolr>>(empsolrservice.getEmps(),HttpStatus.OK) ;
	}
	
//	@PutMapping("/updateemployee")
//	public ResponseEntity<String> updateEmp(@Valid @RequestBody Employee employe) {
//		String updateEmployee =empsolrservice.update(employe);
//		return new ResponseEntity<String>(updateEmployee,HttpStatus.OK);
//	}

//	@DeleteMapping("/employee/{empid}")no
//	public ResponseEntity<String> deleteEmp(@PathVariable int empid) {
//		empsolrservice.delete(empid);
//		return new ResponseEntity<String>("Employee has been deleted successfully!",HttpStatus.OK);
//	}
//	
}