package com.briup.exercise50;
/**
 * 水仙花数测试类
 * @author Administrator
 *
 */
public class ShuiXianHuaTest {
	public static void main(String[] args) {
		Object o=1-2/5+2 *5;
		System.out.println(o);
		for (int i = 100; i < 1000; i++) {
			if((((i/100)*(i/100)*(i/100))+(
					((i%100)/10)*((i%100)/10)*(
							(i%100)/10))+((i%10)*(i%10)*(i%10)))==i){
				System.out.print(i+"  ");
			}
		}
	}
}
