package com.briup.ch14;
import java.lang.reflect.*;

import org.omg.CORBA.PUBLIC_MEMBER;
public class RefTest {
	public static void main(String[] args) throws Exception {
		Class c=Student.class;
		getPack(c);
		System.out.println("++++++++++++++++++++++");
		getField(c);
		System.out.println("++++++++++++++++++++++++");
		getMethod(c);
		System.out.println("++++++++++++++++++++++++");
		System.out.println(c.getName());
	}
	public static void getPack(Class c){
		//获得c的包名并传给Package的p对象
		Package p=c.getPackage();
		//输出包名
		System.out.println(p.getName());
		//获取c的访问修饰符
		int mod=c.getModifiers();
		System.out.println(Modifier.toString(mod));
		Class sc=c.getSuperclass();
		System.out.println(sc.getName());
		Class[] is=c.getInterfaces();
		for(Class i:is){
			System.out.println(i);
		}
	}
	//获取属性
	public static void getField(Class c)throws Exception{
		Student stu=new Student();
		Field[] f1=c.getDeclaredFields();
		//获取Student属性并输出
		for (Field field : f1) {
			//System.out.println(field);//输出所有属性的地址
			System.out.print(Modifier.toString(field.getModifiers())+"  ");
			//获取每个属性的修饰符并打印
			System.out.print(field.getType().getName()+"  ");
			//获取属性的类型的名称并打印
			System.out.println(field.getName());
			//将name属性赋值，类似于stu.name="tom"
			if(field.getName().equals("name")){
				//由于name是私有的，所以使用setAccessiable方法将其是否可修改设置为true
				field.setAccessible(true);
				field.set(stu,"tom");
				//stu.name,获取stu对象的值
				System.out.println(field.get(stu));
			}
			
		}
		System.out.println(stu);
	}
	//获取方法
	public static void getMethod(Class c){
		//将获取的方法对象保存在数组中
		Method[] method=c.getDeclaredMethods();
		//遍历数组获得访问修饰符等
		for(Method m:method){
			//打印访问修饰符
			System.out.print(Modifier.toString(m.getModifiers())+"  ");
			//return_Type
			System.out.print(m.getReturnType()+"  ");
			//method_Name
			System.out.print(m.getName()+"  ");
			//返回方法的返回值类型并保存在数组中
			Class[] cas=m.getParameterTypes();
			//遍历并输出
			for (Class class1 : cas) {
				System.out.println("("+class1.getName()+")");
			}
			System.out.println();
		}
	} 
	
	
	
	
}
