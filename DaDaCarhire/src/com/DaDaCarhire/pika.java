package com.DaDaCarhire;

public class pika extends Car {
	public pika(String carName,int carSeat,double carPrice,int carLoad){
		setCarName(carName);
		setCarSeat(carSeat);
		setCarPrice(carPrice);
		setCarLoad(carLoad);
	}
	public void print(){
		System.out.println(getCarName() +": "+getCarPrice()+"元/天    "+"载重:"+getCarLoad()+"吨   "+"载人："+ getCarSeat()+"人");
	}
}
