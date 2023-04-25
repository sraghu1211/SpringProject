package com.spring.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee,Integer> {

	
}


