package com.briup.pattern.create.Singleton;

public class Test7 {
	
	public static void main(String[] args) throws Exception {
		
		Singleton7 s1 = Singleton7.getInstance();
		
		Singleton7 s2 = s1.copy();
		
		System.out.println(s1 == s2);
			
	}	
	
}
