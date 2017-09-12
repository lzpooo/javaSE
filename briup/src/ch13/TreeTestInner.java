package ch13;

import java.util.*;
import java.util.Set;

public class TreeTestInner {
	public static void main(String[] args) {
		Set<Integer> set1=new TreeSet<Integer>(new Comparator<Object>() {
			public int compare(Object o1,Object o2){
				Integer s1=(Integer)o1;
				Integer s2=(Integer)o2;
				if(s1%2==0){
					return 6666;
				}
				else if(s1%2==1){
					return -6666;
				}
				if(s1.compareTo(s2)>0){
					return 1;
				}
				else if(s1.compareTo(s2)<0){
					return -1;
				}
				else {
					return 0;
				}
			}
		});
		for (int i = 1; i < 11; i++) {
			set1.add(i);
		}
		for(Integer c:set1){
			System.out.println(c+"  ");
		}
	}
}
