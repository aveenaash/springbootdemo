package com.rab3.springbootdemo.controllers;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rab3.springbootdemo.services.PropertiesService;

@RestController
@RequestMapping(value = "/test")
public class TestController {
	
	Logger logger = Logger.getLogger(TestController.class);
			
	@Autowired
	private PropertiesService testService;

	@RequestMapping(value = "/properties", method = RequestMethod.GET)
	public void readProperties() {
		logger.info("entered test controller");
		testService.readValues();
	}
}
