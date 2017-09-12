package com.ch05;

public class Bank {
	private Customer customers[]=new Customer[99];
	
	private int custsum;
	public Bank(){
	}

	public void addCustomer(Customer customer){
		customers[custsum]=customer;
		custsum++;
	}

	public Customer getCustomer(int index){
		return customers[index];
	}

	public int getCustomerSum(){
		return custsum;
	}
}

