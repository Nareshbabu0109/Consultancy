package com.services.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.services.pojo.CompanyPojo;

@Repository
public interface CompanyDao extends JpaRepository<CompanyPojo, Integer> {

}
