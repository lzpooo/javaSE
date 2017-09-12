package com.briup.ch14;

public class ExceptionTest {
	public static void main(String[] args)throws ArithmeticException {
		int i=10;
		int j=0;
		int res=0;
		try{
			res=i/j;
			throw new ArithmeticException("err...");
			
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		finally{
		System.out.println("res:"+res);
	}
	}
}
