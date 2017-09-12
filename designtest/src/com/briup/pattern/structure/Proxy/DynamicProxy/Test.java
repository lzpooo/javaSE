package com.briup.pattern.structure.Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	
	public static void main(String[] args) {
		
		IStudentService target = new StudentServiceImpl();
		
		Class<? extends IStudentService> c = target.getClass();
		ClassLoader classLoader = c.getClassLoader();
		Class<?>[] interfaces = c.getInterfaces();
		InvocationHandler h = new MyHandler(target);
		//新建一个代理实例，传入三个参数
		IStudentService service = (IStudentService)Proxy.newProxyInstance(classLoader, interfaces, h);
		service.delete(1);
//		proxy.delete(1L);
//		proxy.save(new Student());
//		proxy.find(1L);
		
//		System.out.println(proxy.toString());
//		System.out.println(proxy.getClass());
		
	}
	
}
