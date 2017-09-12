package com.briup.ch14;

public class TestException

{
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException,NullPointerException,ArrayStoreException
	{
		try {
			args=new String[2];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界！");
		}
		catch (NullPointerException n) {
			System.out.println("空指针异常！");
		}
		catch (ArrayStoreException a2) {
			System.out.println("数据类型异常！");
		}
		finally{
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		}
	}
}