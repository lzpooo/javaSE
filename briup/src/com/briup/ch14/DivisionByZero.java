package com.briup.ch14;

public class DivisionByZero {
	public static void division()throws ArithmeticException{
		int i=10;
		int y=0;
		int res=0;
		res=i/y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//division();
			//抛出一个新的异常“错误了”
			throw new ArithmeticException("错误了");
			 
		}
		catch(ArithmeticException a){
			//将此异常追踪输出至标准错误流
			a.printStackTrace();
			System.out.println(a.getMessage());//获取异常的字符串信息
		}
		finally{
			System.out.println("我在这！");
		}
	}

}
