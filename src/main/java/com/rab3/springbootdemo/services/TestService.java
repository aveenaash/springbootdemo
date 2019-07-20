package com.rab3.springbootdemo.services;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.rab3.springbootdemo.controllers.TestController;

@Service
public class TestService {
	
	Logger logger = Logger.getLogger(TestService.class);
	
	@Value("${info.build.artifact}")
	private String artifact;

	public void readValues() {
		logger.info("Artifact = " + artifact);
	}
}
