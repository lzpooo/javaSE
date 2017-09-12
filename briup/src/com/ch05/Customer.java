package com.ch05;

public class Customer {
	private Account account;
	public  String name;
	
	public Customer(String name){
		this.name=name;
	}
	public Account getAccount(){
		return account;
	}

	public void setAccount(Account account){
		this.account=account;
	}
	public String getName(){
		return name;
	}
}
