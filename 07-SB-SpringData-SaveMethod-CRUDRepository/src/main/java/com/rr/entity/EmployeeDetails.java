package com.rr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EMPLOYEE_DETAILS")
public class EmployeeDetails {
	
	@Id
	@Column(name="EMPNO")
	private Integer eNo;
	@Column(name="ENAME")
	private String eName;
	@Column(name="PHONENO")
	private Long phoneNo;
	
	
}
