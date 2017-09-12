package ch10;


import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		for(int i=0;i<10;i++){
			map.put(i, "hello");
		}
		Set set=map.keySet();
		Iterator iterator=set.iterator();
		for(;iterator.hasNext();){
			System.out.println(iterator.next());
		}
		System.out.println("-------------------------------");
		Set set1=map.keySet();
		Iterator iterator2=set1.iterator();
		for(;iterator2.hasNext();){
			Object object=iterator2.next();
			System.out.println("key:"+object+"  value:"+map.get(object));
		}
		System.out.println("--------------------------------------");
		Collection collection=map.values();
		Iterator iterator3=collection.iterator();
		while(iterator3.hasNext()){
			System.out.println(iterator3.next());
		}
		System.out.println("------------------------------");
		Set set3=map.entrySet();
		Iterator iterator4=set3.iterator();
		while(iterator4.hasNext()){
			Object entry=iterator4.next();
			System.out.println(entry);
		}
		
		
		
	}

}
