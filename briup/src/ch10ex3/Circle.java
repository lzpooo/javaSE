package ch10ex3;

public class Circle implements Geometry {
	private double r;
	final double PII=3.141592653589793238462643383279502884197169399375;
	                   
	public Circle(double r){
		this.r=r;
	}
	
	//反回圆的底面积
	public double getArea() {
		
		return Math.PI*r*r;
	}

}
