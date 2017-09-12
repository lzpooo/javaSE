package com.briup.day01;

public class ShoppingTest {
	public static void main(String[] args) {
		Commodity c1 = new Commodity("洗发水",8);
		Commodity c2 = new Commodity("肥皂",2.8);
		Commodity c3 = new Commodity("洗面奶",5.8);
		Commodity c4 = new Commodity("沐浴露",58);
		ShoppingCar s1 = new ShoppingCar();
		s1.addCommodity(c1);
		s1.addCommodity(c2);
		s1.addCommodity(c4);
		s1.addCommodity(c3);
		System.out.println(s1.getTotalPrice());
		System.out.println(s1.select());
	}
}
