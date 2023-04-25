package com.spring.dao;


import java.util.List;

import org.springframework.data.solr.repository.SolrCrudRepository;
import com.spring.entity.EmployeeSolr;

public interface EmpSolr extends SolrCrudRepository<EmployeeSolr,Integer> {

	String save(EmployeeSolr employe);

	String saveAll(List<EmployeeSolr> employees);

	List<EmployeeSolr> findAll();

	EmployeeSolr findById(int emp_id);



//	void save();
//	void saveAll();
//	String save(EmployeeSolr employe);
//
//	String saveAll(List<EmployeeSolr> employees);


}
