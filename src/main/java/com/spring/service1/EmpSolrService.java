package com.spring.service1;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.dao.EmpSolr;
import com.spring.entity.EmployeeSolr;


@Service
public class EmpSolrService {

	@Autowired
	private EmpSolr empl;
	
	public String create(EmployeeSolr employe) {
//	Employee existing = empl.findById(employe.getEmpid());
//	if(existing == null) {
		return empl.save(employe);

	}
//	else
//		throw new EmployeAlreadyExistException("Data Already exist");
//}

	public String createemployees(List<EmployeeSolr> employees) {
		return empl.saveAll(employees);
		
	}

public EmployeeSolr getEmpById(int emp_id) { 
	 return empl.findById(emp_id);
}
	

public List<EmployeeSolr> getEmps() {
////	if(emp.count()>1) { 
////		  throw new NoSuchEmployeeExistException("NO DATA IS AVAILABLE IN DATABASE"); 
////	  }
////	 else {
	  return empl.findAll();
}

//public String update(EmployeeSolr employe) {
//	Employee optionalemp=empl.findById(employe.getEmpid());
//	if(optionalemp!=null) {
//	optionalemp.setName(employe.getName());
//	optionalemp.setLocation(employe.getLocation());
//	optionalemp.setAge(employe.getAge());
//	optionalemp.setSkillset(employe.getSkillset());
//	empl.save(optionalemp);
//	return "RECORD HAS BEEN UPDATED";
//	}
//	else {
//		throw new NoSuchEmployeeExistException("EMPLOYEE NOT EXIST");
//	}
//}

//public String delete(int emp_id) {
//	EmployeeSolr exist=empl.findById(emp_id);
//	if(exist!=null) {
//		 empl.deleteById(emp_id);
//		 return "Employee got deleted";
//	}
//	else {
//		throw new NoSuchEmployeeExistException("Employee not exist");
//	}
//	
//	
//}

}
