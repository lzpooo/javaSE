package com.black;

public class Rectangle extends Shape 
{
	public double width;
	public double height;

	//无参构造器
	public Rectangle(){
		this.width=1.0;
		this.height=1.0;
	}

	public  Rectangle(double width,double height)
	{
		this.width=width;
		this.height=height;
	}

	public  Rectangle(double width,double height,int x,int y)
	{
		super(x,y);
		this.width=width;
		this.height=height;
//		this.x=x;
//		this.y=y;
	}

	public void draw(){
		System.out.println("draw in rectangle"+x+y+height+width);
	}

}
