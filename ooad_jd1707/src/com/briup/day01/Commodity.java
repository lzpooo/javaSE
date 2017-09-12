package com.briup.day01;

/**
 * 商品类
 * 
 * @author Administrator
 *
 */
public class Commodity {
	private String name;
	private double price;
	private int number = 0;
	
	public Commodity(){};
	
	public Commodity(String name, double price) {
		this.name = name;
		this.price = price;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
