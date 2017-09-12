package com.ch05;

public class Account {
	protected double balance;
    public Account(){}
	public Account(double balance){
		this.balance=balance;
	}

	public double getBalance(){
		return balance;
	}
	public boolean deposit(double amount){
		balance=balance+amount;
		return amount>0;
	}

	public boolean withdraw(double amount){
//		return (amount>balance)?false:true ;
//		balance=balance-amount;
		if(amount>balance){
			return false;
		}
		else {
			balance-=amount;
			return true;
		}
	}
}
