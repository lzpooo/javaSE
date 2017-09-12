package ch10;

import java.util.*;


public class TreeSetTest {
	
	public static void addMap(Map map){
		map.put(2, "hello");
		map.put(5, "world");
		map.put(9, "hi");
	}
	public static void getKey(Map map){
		System.out.println("___________getKey__________");
		Set set=map.keySet();
		Iterator iterable=set.iterator();
		for(;iterable.hasNext();){
			System.out.println(iterable.next());
		}
	}
	
	public static void getValueByKey(Map map) {
		System.out.println("_________getValueByKey________");
		Set set=map.keySet();
		Iterator iterable=set.iterator();
		for(;iterable.hasNext();){
			Object object=iterable.next();
			System.out.println("key:"+object+"  value:"+map.get(object));
		}
		
	}
	
	public static void getValueAndKey(Map map){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map=new HashMap();
		addMap(map);
		System.out.println(map.size());
		getKey(map);
		System.out.println(map);
		getValueByKey(map);
		
		
		
		
		/*
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
		*/
	}

}
