package com.spring.entity;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@SolrDocument(collection = "EMP")
public class EmployeeSolr{


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int empid;


public int getEmpid() {
	return empid;
}




@Field("empid")
public void setEmpid(int empid) {
	this.empid = empid;
}

@Field
private String name;

@Field
private int age;

@Field
private String skillset;

@Field
private String location;

public EmployeeSolr(int empid,String name,int age,String skillset,String location) {
	super();
	this.empid = empid;
	this.name = name;
	this.age = age;
	this.skillset = skillset;
	this.location = location;
}







public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}





public String getSkillset() {
	return skillset;
}


public void setSkillset(String skillset) {
	this.skillset = skillset;
}


public String getLocation() {
	return location;
}


public void setLocation(String location) {
	this.location = location;
}


}
