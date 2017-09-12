package com.briup.day01;

import java.util.ArrayList;
import java.util.List;



public class Test1 {
	public static void main(String[] args) {
		String s1="asfilhewocilagigcsgusadgabs";
		char[] c=s1.toCharArray();
		List<Character> list =new ArrayList<Character>();
		for(Character c1:c){
			if (list.contains(c1)){
				continue;
			}
			list.add(c1);
		}
		for (int i = 0; i < list.size(); i++) {
			int a=0;
			for (int j = 0; j < c.length; j++) {
				if(list.get(i).equals(c[j])){
					a++;
				}
			}
			System.out.println(list.get(i)+"出现了："+a+"次！");
		}
		
		
	}
}
