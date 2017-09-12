package com.ch05;

public class SavingAccount extends Account
{
	public  double rate;
	//获取利率
	
	public SavingAccount (double balance,double rate){
		this.balance=balance;
		this.rate=rate;
	}
//	public double  getRate(){
//		return rate;
//	}
//	
//	public void setRate(double rate){
//		this.rate=rate;
//	}
}
