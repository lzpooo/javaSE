package com.briup.socket;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class RefTest {
	public static void main(String[] args) throws Exception {
		Class c=Class.forName("com.briup.socket.MyThread");
		System.out.println(c);
		RefTest rt=new RefTest();
		rt.getPack(c);
		rt.getField(c);
	}
	public void getPack(Class c)throws Exception{
		//获取Test的包名
		Package p=c.getPackage();
		System.out.println(p);
		//获取访问修饰符
		int mod=c.getModifiers();
		System.out.println(Modifier.toString(mod));
		System.out.println(c.getSuperclass().getName());
	}
	public void getField(Class c)throws Exception{
		Field[] f=c.getDeclaredFields();
		for(Field f1:f){
			System.out.println(Modifier.toString(f1.getModifiers())+"  ");
		}
	}
}
