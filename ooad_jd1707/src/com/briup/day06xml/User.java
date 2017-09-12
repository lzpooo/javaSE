package com.briup.day06xml;
/**
 * sax和dom解析测试，银行账户类
 * @author Administrator
 *
 */
public class User {
	private String name;
	private Double account;
	
	public User() {
		super();
	}

	public User(String name, Double account) {
		
		this.name = name;
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAccount() {
		return account;
	}

	public void setAccount(Double account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return  name + "," + account ;
	}
	
}
