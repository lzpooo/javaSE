package com.briup.day02.singlemodel;

public class Test {
	public static void main(String[] args) {
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		Single s3 = Single.getInstance();
		Single s4 = Single.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
