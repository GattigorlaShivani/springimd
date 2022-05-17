package com.jobiak.imd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(scanBasePackages = {"com.jobiak.imd","com.jobiak.model","com.jobiak.repository"})
public class SpringbootImdday42Application 
{
	public static void main(String[] args) 
	{
		System.out.println("starting boot app");
		SpringApplication.run(SpringbootImdday42Application.class, args);
		System.out.println("boot app started");
	}
}
