package com.briup.pattern.create.FactoryMethod.StaticFactory;

public class Test {
	public static void main(String[] args) {  
		Sender sender = SendFactory.produceSms();  
        sender.Send();  
    }  
}
