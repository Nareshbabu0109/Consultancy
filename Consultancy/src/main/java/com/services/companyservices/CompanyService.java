package com.services.companyservices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.services.dao.CompanyDao;
import com.services.pojo.CompanyPojo;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyDao dao;
	
	
	
	
	public void saveCompany(CompanyPojo pojo) {
		dao.save(pojo);
		
	}
	public CompanyPojo getEmployee(Integer id) {
		Optional<CompanyPojo> empid=dao.findById(id);
		return empid.get();
	}
}
