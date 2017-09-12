package com.briup.pattern.create.Prototype;

public class Prototype1 implements Cloneable {  
	private int num;
	//浅复制
	public Object clone() throws CloneNotSupportedException {  
		Prototype1 proto = (Prototype1) super.clone();  
		return proto;  
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}  
