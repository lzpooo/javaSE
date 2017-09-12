package ch13ex;

import java.util.HashMap;

public class Bank {
	private HashMap<Integer, Customer> customers;
	private int custNum;
	public Bank(){
		
	}
	public void addCustomers(Customer customer){
		customers.put(custNum, customer);
		custNum++;
	}
	public Customer getCustomer(int index){
		return customers.get(index);
	}
	public HashMap<Integer, Customer> getAllCustomer(){
		return customers;
	}
	public int getCustomerNum(){
		return custNum;
	}
}
