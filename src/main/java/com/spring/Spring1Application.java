package com.spring;

import java.time.Duration;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.spring.dao.EmpSolr;
import com.spring.entity.EmployeeSolr;
import com.spring.service1.EmpService;
import com.spring.service1.EmpSolrService;

@SpringBootApplication
@ComponentScan(basePackages = { "com.spring.dao", "com.spring.controller" })
public class Spring1Application {
	public static void main(String[] args) {
		SpringApplication.run(Spring1Application.class, args);
	}

	@Bean
	public EmpSolrService empSolrService() {
		return new EmpSolrService();
	}
	
	@Bean
	public EmpService empService() {
		return new EmpService();
	}
	
	@Bean
	public EmpSolr empSolr() {
		return new EmpSolr() {

			@Override
			public <S extends EmployeeSolr> S save(S entity, Duration commitWithin) {
				return null;
			}

			@Override
			public <S extends EmployeeSolr> Iterable<S> saveAll(Iterable<S> entities, Duration commitWithin) {
				return null;
			}

			@Override	
			public long count() {
				return 0;
			}

			@Override
			public Iterable<EmployeeSolr> findAll(Sort sort) {
				return null;
			}

			@Override
			public Page<EmployeeSolr> findAll(Pageable pageable) {
				return null;
			}

			@Override
			public String save(EmployeeSolr employe) {
				return null;
				// TODO Auto-generated method stub
				
			}

			@Override
			public String saveAll(List<EmployeeSolr> employees) {
				return null;
				// TODO Auto-generated method stub
				
			}

			@Override
			public List<EmployeeSolr> findAll() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public EmployeeSolr findById(int emp_id) {
				// TODO Auto-generated method stub
				return null;
			}

	
	};
}
}
