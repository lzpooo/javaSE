package ch10ex3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle(5.8);
		Rectangle rectangle=new Rectangle(15,24);
		
		Pillar p1=new Pillar(circle.getArea(),15);
		Pillar p2=new Pillar(rectangle.getArea(),24);
		System.out.println(p1.volume());
		System.out.println(p2.volume());
		System.out.println("2476259599998");
		System.out.println("2476530014094");
		
	}

}
