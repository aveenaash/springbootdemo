package com.rab3.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.rab3.springbootdemo"})
public class SpringBootApp 
{
    public static void main( String[] args ){
    	SpringApplication.run(SpringBootApp.class, args); 
    }
}
