package com.rab3.springbootdemo.services;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class PropertiesServiceTest {

	private PropertiesService propertiesService;
	
	@Before
	public void setup() {
		propertiesService = new PropertiesService();
	}
	
	@Test
	public void testCalculateTax() {
		assertEquals(1000d, propertiesService.calclutaeTax(10000),0);
		assertEquals(5500d, propertiesService.calclutaeTax(40000),0);
		assertEquals(0, propertiesService.calclutaeTax(0),0);
		assertEquals(0, propertiesService.calclutaeTax(90000),0);
		//TODO finish up test case
	}
	
	
}
