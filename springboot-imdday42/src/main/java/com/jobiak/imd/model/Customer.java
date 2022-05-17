package com.jobiak.imd.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private long custno;
	
	private String name;
	private double balance;
	public long getCustno() {
		return custno;
	}
	public void setCustno(long custno) {
		this.custno = custno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer(long custno, String name, double balance) {
		super();
		this.custno = custno;
		this.name = name;
		this.balance = balance;
	}
	public Customer()
	{
		
	}


}
