package ch10ex3;

public class Rectangle implements Geometry {
	private double a;
	private double b;
	public  Rectangle(double a,double b) {
		this.a=a;
		this.b=b;
	}
	@Override
	public double  getArea() {
		// TODO Auto-generated method stub
		return a*b;

	}

}
