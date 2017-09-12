package com.briup.pattern.structure.Proxy.CglibProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

//产生代理对象的工厂类
public class MyCglibProxyFactory implements MethodInterceptor {  
  
	//创建代理类的实例
	public Object getInstance(Class<?> c) {  
	    Enhancer enhancer = new Enhancer();  
	    enhancer.setSuperclass(c);  
	    enhancer.setCallback(this);  
	    return enhancer.create();  
	}  
	
	//传入目标类，目标方法，参数
	public Object intercept(Object obj, Method method, Object[] args,  
	        MethodProxy proxy) throws Throwable {  

	    System.out.println("开始执行方法");  
	    //这句代码最终会执行到我们目标对象中的方法
	    proxy.invokeSuper(obj, args);  
	    System.out.println("方法执行结束"); 

	    return null; 
	}  
}
