package com.black;

public class ShapeTest{
	public static void main(String[] args) {

//        Rectangle rectangle=new Rectangle();
//        
//        Rectangle rectangle2=new Rectangle(10.0, 20.0);
//        
//        Rectangle rectangle3=new Rectangle(1.0,1.2,1,2);
        
		Shape[] s={new Shape(1,4), new Rectangle(1,2,3,4), new Circle(2,3,5)};
		for(int k = 0; k < s.length; k++){
			s[k].draw();
		}
	}
}