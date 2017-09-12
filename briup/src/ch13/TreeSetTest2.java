package ch13;

import java.util.*;
public class TreeSetTest2{
	public static void main(String[] args){
		Set<Integer> set=new TreeSet<Integer>(new ComparatorTest1());
		for(int i=1;i<11;i++){
			set.add(i);
		}
		for(Integer i:set){
			System.out.print(i+"  ");
		}

	}
}
 class ComparatorTest1 implements Comparator<Integer>{
	
	public int compare(Integer o1,Integer o2){
		int x=o1%2;
		int y=o2%2;
		if(x>y){
			return 1;
		}
		else if (x<y) {
			return -1;
		}
		else{
			if(x==1){
				return o1.compareTo(o2);
			}
			if(x==0) {
				return -o1.compareTo(o2);
			}
		}
		return 0;
	}
}

//class ComparatorTest implements Comparator<Integer>{
//	public int compare(Integer o1,Integer o2){
//		if(o1%2==1&&o2%2==0){
//			return 1;
//		}
//		if(o1%2==0&&o2%2==1){
//			return -1;
//		}
//		if(o1%2==1 && o2%2==1){
//			if(o1>o2){
//				return 1;
//			}
//			else{
//				return -1;
//			}
//		}
//		if(o1%2==0 && o2%2==0){
//			if(o1>o2){
//				return -1;
//			}
//			else{
//				return 1;
//			}
//		}
//		return 0;
//
//	}
//} 
