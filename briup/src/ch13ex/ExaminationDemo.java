package ch13ex;

public class ExaminationDemo {
	public static void main(String[] args) {
		System.out.println("1运行 ExaminationDemo 中的 main 函数， 创建 D 类实例");//1
		new D();
		
	}
}

class E {
	E() {
		System.out.println("8执行 E 的构造函数");//8
	}

	public void funcOfE() {
		System.out.println("12执行 E 的函数");//12
	}
	public void getPrint(){
		System.out.println("这是第几步？");
	}
}

class F {
	F() {
		System.out.println("2执行 F 的构造函数");//2
	}

	public void funcOfF() {
		System.out.println("4执行 F 的函数");//4
	}
}

class B {
	{
		System.out.println("10执行 B 实例的普通初始化块");//10
	}
	static {
		System.out.println("ooo执行 B 类的 static 块(B 包含 E 类的成员 变量,包含静态 F 类成员变量)");//3
		
	}
	E e = new E();
	static F f = new F();
	public String sb = getSb();
	

	static {
		System.out.println("3执行 B 类的 static 块(B 包含 E 类的成员 变量,包含静态 F 类成员变量)");//3
		f.funcOfF();
	}

	

	B() {
		System.out.println("11执行 B 类的构造函数(B 包含 E 类的成员变 量,包含静态 F 类成员变量)");//11
		e.funcOfE();
	}

	public String getSb() {
		System.out.println("9初始化 B 的实例成员变量 sb");//9
		return "sb";
	}
	
}

class C extends B {
	static {
		System.out.println("5执行 C 的 static 块(C 继承 B)");//5
	}

	{
		System.out.println("13执行 C 的普通初始化块");//13
	}

	C() {
		System.out.println("14执行 C 的构造函数(C 继承 B)");//14
	}
}

class D extends C {
	public String sd1 = getSd1();
	public static String sd = getSd();//null

	static {
		System.out.println("7执行 D 的 static 块(D 继承 C)");//7
	}

	{
		System.out.println("16执行 D 实例的普通初始化块");//16
	}
	public void D(){
		System.out.println("D");
	}
	D() {
		System.out.println("17执行 D 的构造函数(D 继承 C);父类 B 的实 例成员变量 sb 的值为：" + sb + ";本类 D 的 static 成员变量 sd 的值为：" + sd
				+ "; 本类 D 的实例成员变量 sd1 的值是：" + sd1);//17
		e.getPrint();
	}

	static public String getSd() {
		System.out.println("6初始化 D 的 static 成员变量 sd");//6 
		return "sd";
	}

	public String getSd1() {
		System.out.println("15初始化 D 的实例成员变量 sd1");//15
		return "sd1";
	}
}