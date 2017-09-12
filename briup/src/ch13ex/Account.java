package ch13ex;

public class Account {
	protected double balance;
	private double amount;
	public Account(){
		
	}
	public Account (double balance){
		this.balance =balance;
	}
	
	public double getBalance(){
		return balance;
	}
	public boolean deposit(double amount){
		balance=balance+amount;
		return amount>0;
		
	}
	public boolean withdraw(double amount){
		if(amount>balance){
			return false;
		}
		else {
			balance-=amount;
			return true;
		}
	}
}
