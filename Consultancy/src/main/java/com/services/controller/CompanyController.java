package com.services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.services.companyservices.CompanyService;
import com.services.pojo.CompanyPojo;









@RestController
@RequestMapping("/companydetails")
public class CompanyController {

	@Autowired
	private CompanyService service;

	/*
	 * @Autowired private RestTemplate restTemplate;
	 */

	@PostMapping("/add")
	public ResponseEntity<String> saveCompany(@RequestBody CompanyPojo pojo) {
		service.saveCompany(pojo);
		ResponseEntity<String> response = new ResponseEntity<String>("Success", HttpStatus.CREATED);
		return response;
	}

	@GetMapping("user/{id}")
	  public ResponseEntity<CompanyPojo> getCompany(@PathVariable Integer id){
		  
	 CompanyPojo pojo=service.getEmployee(id); 
	  return new ResponseEntity<CompanyPojo>(pojo,HttpStatus.OK); }
	 
	
	/*
	 * @GetMapping("emp/{id}") public Object getEmployee(@PathVariable Long id){
	 * String Url="http://localhost:8011/EmployeeDetails/employee/"; Object
	 * objects=restTemplate.getForObject(Url, Object.class); return objects;
	 * 
	 * }
	 */
	

}
