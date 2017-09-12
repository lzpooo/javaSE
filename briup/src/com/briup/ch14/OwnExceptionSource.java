package com.briup.ch14;

public class OwnExceptionSource {
	public static int a(int a ,int b)throws OwnException,ArithmeticException{
		return a/b;
	}
}
