package ch13;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;



public class TreeSetTest1 {
	public static void main(String[] args) {
		Set<String> set2=new TreeSet<String>(new MyComparator());
		set2.add("");
		set2.add("");
		set2.add("");
		set2.add("");
		set2.add("");
		set2.add("");
	}
}
class MyComparator implements Comparator<Object>{
	

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		 return 1;
	}
}
