package ch13ex;

public class Test {
	static F1 f=new F1();
	public static String str=getT();
	
	static {
		System.out.println("1");
	}
	public Test(){
		System.out.println("2");
	}
	public static String getT(){
		System.out.println("3");
		return "3";
	}
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(str);
	}
}
class F1{
	F1(){
		System.out.println("f");
	}
}
