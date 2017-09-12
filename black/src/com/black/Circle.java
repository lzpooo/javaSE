package com.black;

public class Circle extends Shape
{
	public double r;
	public Circle(){
		this.r=1.0;
	}

	public  Circle(double r){
		this.r=r;
	}

	public Circle(int x,int y,double r){
		this.x=x;
		this.y=y;
		this.r=r;
	}

	public void draw(){
		System.out.println("draw in circle"+x+y+r);
	}
}
