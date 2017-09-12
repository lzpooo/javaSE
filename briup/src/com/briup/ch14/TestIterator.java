package com.briup.ch14;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;
import java.awt.*;

public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("好好学习！");
		list.add("天天向上！");
		ListIterator<String> it=list.listIterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println();
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
		
	}

}
