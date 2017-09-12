package ch13ex;

public class CheckingAccount extends Account {
	private double overdraft;
	
	public CheckingAccount(double balance,double overdraft){
		this.balance=balance;
		this.overdraft=overdraft;
	}
	public CheckingAccount(double balance){
		this.balance=balance;
	}
	public boolean withdraft(double amount){
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
	public double getOverdraft() {
		return overdraft;
	}
}
