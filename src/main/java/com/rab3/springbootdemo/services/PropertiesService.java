package com.rab3.springbootdemo.services;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class PropertiesService {
	
	Logger logger = Logger.getLogger(PropertiesService.class);
	
	@Value("${info.build.artifact}")
	private String artifact;

	public void readValues() {
		logger.info("Artifact = " + artifact);
	}
	
	
	public double calclutaeTax(double salary) {
		double tax = 0;
		
		if(salary <= 10000) {
			tax =  0.1 * salary;
		} else if(salary > 10000 && salary <= 50000) {
			tax = (0.1 * 10000) + (0.15 * (salary- 10000));
		} else if(salary > 50000 && salary <= 100000) {
			tax = (0.1 * 10000) + (0.15 * 40000) + (0.25 * (salary - 50000));
		} else {
			tax = (0.1 * 10000) + (0.15 * 40000) + (0.25 * 50000) + (0.4 * (salary - 100000));
		}
			
		return tax;
	}
}
