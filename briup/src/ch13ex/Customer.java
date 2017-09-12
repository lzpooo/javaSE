package ch13ex;

import java.util.ArrayList;

public class Customer {
	private ArrayList<Account> accounts;
	private String name;
	public Customer (String name){
		this.name=name;
	}
	public Account getAccount(int index){
		return accounts.get(index);
	}
	public ArrayList<Account> getAllAccount(){
		return accounts;
	}
	public void addAccount(Account account){
		accounts.add(account);
	}
	public String getName(){
		return name;
	}
}
