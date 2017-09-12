package com.briup.day02.factorytest;
/**
 * 作业练习一：处理汽车
 * @author Administrator
 *
 */
public class CommonFactory {
	public Car privider(String s){
		if(s.equals("CarA")){
			return new CarA();
		}else if(s.equals("CarB")){
			return new CarB();
		}
		else if(s.equals("CarC")){
			return new CarC();
		}
		return null;
	}
}
