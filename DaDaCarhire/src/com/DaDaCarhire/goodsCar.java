package com.DaDaCarhire;

public class goodsCar extends Car {
	public goodsCar(String carName,int carLoad,double carPrice){
		setCarName(carName);
		setCarLoad(carLoad);
		setCarPrice(carPrice);
	}
	public void print(){
		System.out.println(getCarName() +": "+getCarPrice()+"元/天    "+"载重："+ getCarLoad()+"吨");
	}
}
