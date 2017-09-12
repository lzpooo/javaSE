package ch13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestPoint {

	public static void mapTest(){
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("yon",16846);
		
	}
	
	public static void print(List<?> list){//通配符，想传什么传什么
		for(Object object:list){
			System.out.println(object);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point<Integer,Double> point=new Point<Integer,Double>(12,15.3);
		Integer x=point.getX();
		Double y=point.getY();
		System.out.println(x+","+y);
		List<String> list=new ArrayList<String>();//类型参数保持一致
		list.add("dd");
		for(String c:list){
			System.out.println(c);
		}
		print(list);
		
	}

}
