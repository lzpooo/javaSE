package com.ch05;

public class CheckingAccount extends Account
{
	private double overdraft;
	//设置透支额度
	public void setOverdraft(double overdraft){
		this.overdraft=overdraft;
	}
	public double getOverdraft(){
		return overdraft;
	}

	public CheckingAccount(double balance,double overdraft){
		this.balance=balance;
		this.overdraft=overdraft;
	}
	public CheckingAccount(double overdraft){
		
		this.overdraft=0;
	}

	public boolean withdraw(double amount){
		
//		return (amount>balance+overdraft)?false:true;
		if (amount>balance+overdraft) {
			return false;
		}
		else {
			balance=balance-amount;
			if(balance <0){
				overdraft=overdraft+balance;
			
			}
			else {
				
			}
			return true;
		}
	}

	
}
