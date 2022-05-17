package com.jobiak.imd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.jobiak.imd.model.Customer;
import com.jobiak.imd.repository.CustomerRepo;

@Component
public class MyCommandLineClass implements CommandLineRunner
{
	@Autowired
	CustomerRepo repo;
	
	@Autowired
	Customer cust;
	
	@Override
	public void run(String[] args) throws Exception
	{
		cust.setCustno(1);
		cust.setName("abc");
		cust.setBalance(4000);
		repo.save(cust);
		
		/*
		Customer c1 = new Customer();c1.setAcctno(101);c1.setName("Xiang");
		c1.setBalance(4000);
		repo.save(c1);Customer 
		*/
		
	}
}

@Configuration
class CustomerConfiguration
{
	@Bean
	public Customer createCustomer()
	{
		return new Customer();
	}
}