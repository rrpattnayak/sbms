package com.rr.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.rr.entity.EmployeeDetails;

public interface MyCrudrepository extends CrudRepository<EmployeeDetails, Serializable>{
	
}
