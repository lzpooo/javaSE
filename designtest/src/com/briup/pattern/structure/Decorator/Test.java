package com.briup.pattern.structure.Decorator;

public class Test {
	public static void main(String[] args) {
		
		/*用户可以根据需求 任意给go方法添加听音乐或者休息的功能*/
//		Action a = new Person();
//		Action a = new ListenDecorator(new Person());
//		Action a = new RelaxDecorator(new Person());
//		Action a = new RelaxDecorator(new ListenDecorator(new Person()));
		Action a = new ListenDecorator(new RelaxDecorator(new Person()));
		a.go();
		
	}
}
