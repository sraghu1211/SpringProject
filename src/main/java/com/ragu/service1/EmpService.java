package com.ragu.service1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ragu.dao.EmpRepo;
import com.ragu.entity.Employee;
import com.ragu.exception.EmployeAlreadyExistException;
import com.ragu.exception.NoSuchEmployeeExistException;

@Service
public class EmpService {
@Autowired
private EmpRepo emp;

public String create(Employee employe) {
	Employee existing = emp.findById(employe.getEmpid()).orElse(null);
	if(existing == null) {
		emp.save(employe);
		return"RECORD CREATED";	
	}
	else
		throw new EmployeAlreadyExistException("Data Already exist");
}
	


public String createemployees(List<Employee> employees) {
	 emp.saveAll(employees);
	 return"CHANNGES";
} 

public Employee getEmpById(int empid) { 
	 return emp.findById(empid).orElseThrow(()->new NoSuchEmployeeExistException("No such Employee present with id:"+empid));
}

public List<Employee> getEmps() {
	if(emp.count()>1) { 
		  throw new NoSuchEmployeeExistException("NO DATA IS AVAILABLE IN DATABASE"); 
	  }
	 else {
		  return emp.findAll();
	}
}

public String update(Employee employe) {
	Employee optionalemp=emp.findById(employe.getEmpid()).orElse(null);
	if(optionalemp!=null) {
	optionalemp.setName(employe.getName());
	optionalemp.setLocation(employe.getLocation());
	optionalemp.setAge(employe.getAge());
<<<<<<< HEAD
	optionalemp.setSkillset(employe.getSkillset());
=======
	optionalemp.setSkill_set(employe.getSkillset());
>>>>>>> demo1
	emp.save(optionalemp);
	return "RECORD";
	}
	else {
		throw new NoSuchEmployeeExistException("EMPLOYEE NOT EXIST");
	}
}

public String delete(int empId) {
	Employee exist=emp.findById(empId).orElse(null);
	if(exist!=null) {
		 emp.deleteById(empId);
		 return "Employee got deleted";
	}
	else {
		throw new NoSuchEmployeeExistException("Employee not exist");
	}
	
	
}


}
 