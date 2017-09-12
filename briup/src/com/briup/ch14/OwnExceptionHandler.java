package com.briup.ch14;

public class OwnExceptionHandler {
	public static void main(String[] args){
		try {
			OwnExceptionSource.a(10,0);
		} catch (OwnException e) {
			// TODO: handle exception
			System.out.println("处理了异常！");
		}
		catch (ArithmeticException  n) {
			// TODO: handle exception
			System.out.println("处理了异常！");
		}
		finally{
			System.out.println("没有异常！");
		}
	}
}
