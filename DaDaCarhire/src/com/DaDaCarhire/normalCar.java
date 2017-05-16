package com.DaDaCarhire;

public class normalCar extends Car {
	public normalCar(String carName,int carSeat,double carPrice){
		setCarName(carName);
		setCarSeat(carSeat);
		setCarPrice(carPrice);
	}
	public void print(){
		System.out.println(getCarName() +": "+getCarPrice()+"元/天    "+"载人："+ getCarSeat()+"人");
	}
}
