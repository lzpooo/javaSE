package com.DaDaCarhire;

public class Car {
	public int carId;
	public int carSeat;//载人数
	public int carLoad;//载重量
	public double carPrice;
	public String carName;
	
	
	public int getCarId(){
		return carId;
	}
	public void setCarId(int carId){
		this.carId = carId;
	}
	public int getCarSeat(){
		return carSeat;
	}
	public void setCarSeat(int carSeat){
		this.carSeat = carSeat;
	}
	public int getCarLoad(){
		return carLoad;
	}
	public void setCarLoad(int carLoad){
		this.carLoad = carLoad;
	}
	public double getCarPrice(){
		return carPrice;
	}
	public void setCarPrice(double carPrice){
		this.carPrice = carPrice;
	}
	public String getCarName(){
		return carName;
	}
	public void setCarName(String carName){
		this.carName = carName;
	}
}
