package com.briup.ch15;

public class StorageTest {

	public static void main(String[] args) {
		
		Storage sto1=new Storage();
		Counter c1=new Counter("Cou",sto1);
		Printer1 p1=new Printer1("Pri",sto1);
		c1.start();
		p1.start();

	}
}
