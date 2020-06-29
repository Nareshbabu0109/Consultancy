package com.services.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;







@Entity
@Table(name="company_table")
public class CompanyPojo {
	
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="company_name")
	private String companyname;
	@Column(name="hr_name")
	private String hrname;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getHrname() {
		return hrname;
	}
	public void setHrname(String hrname) {
		this.hrname = hrname;
	}

}
