package ch13;
import java.util.*;
public class MyStack {
	List<Object> list;
	public MyStack(){
		list =new ArrayList<>();
	}
	public  void push(Object obj){
		
		list.add(obj);

	}
	public  Object pop( ){
		if(list ==null){
			return null;
		}
		return list.remove(list.size()-1);
		
	}
	public static void main(String[] args) {
		MyStack my=new MyStack();
		my.push("java");
		my.push("c++");
		my.push("c#");
		my.push("c");
		my.push("jsp");
		System.out.println(my.pop());
		for (int i = 0; i < 5; i++) {
			System.out.println(my.pop());
		}
	}
	
}
