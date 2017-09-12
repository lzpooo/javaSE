package ch10;
import java.util.*;
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set =new TreeSet();
		set.add("world");
		set.add("hello");
		set.add("hello");
		set.add("hi");
		set.add("a");
		set.add("aa");
		set.add("ab");
		set.add("worlz");
		System.out.println(set.size());
		System.out.println(set);
		Iterator iterator=set.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
