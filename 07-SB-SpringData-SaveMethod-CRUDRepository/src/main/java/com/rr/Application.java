package com.rr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rr.dao.MyCrudrepository;
import com.rr.entity.EmployeeDetails;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		MyCrudrepository myCrudrepository=ctx.getBean(MyCrudrepository.class);
		
		EmployeeDetails empDetails=new EmployeeDetails();
		empDetails.setEName("rakesh");
		empDetails.setENo(22);
		empDetails.setPhoneNo(8339003401l);
		
		myCrudrepository.save(empDetails);
		ctx.close();
	}
}
