package com.briup.pattern.structure.Adapter.Interface;

@SuppressWarnings("all")
public class Test {
	
	public static void main(String[] args) {
		
		Sourceable s1 = new Sourceable(){

			@Override
			public void method1() {
				
			}

			@Override
			public void method2() {
				
			}
			
		};
		
		Sourceable s2 = new Wrapper(){
			@Override
			public void method1() {
				
			}
		};
		
		
	}
	
}
