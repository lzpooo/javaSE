package ch10;
import java.util.*;
public class Test2 {
//	static String name;
	/*public static int getMax(int[] arr){
		
		
		
		
		
		int max=1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=arr[max]){
				max=i;
			}
		}
		return arr[max];
		
	}
	*/
	public static void main(String[] args){
		
		
		for(int i = 1, j = i + 10; i < 5; i ++, j = i *2){  
            System.out.println("i = " + i + " j = " + j);  
        } 
		
		
		
		
		/*
		int[] arr={54,62,81,34,55};
		
		System.out.println(getMax(arr));
		*/
		
		
		/*
		List list=new ArrayList();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		Iterator inte=list.iterator();
		while(inte.hasNext()){
			System.out.print((inte.next()).toString()+"  ");
			
		}
		System.out.println();
		System.out.println("___________________________");

		for(Object temp:list){
			System.out.print(temp+"  ");
		}
		System.out.println();
		System.out.println("____________________________");

		for(int j=0;j<10;j++){
			int a;
			a=(int)(list.get(j));
			System.out.print(a+"  ");
		}
		*/
		
		
		
		
//		Test2 test2=new Test2();
//		test2.draw("sad");
//		System.out.println(name);
//	}
//	public  void draw(String name){
//		this.name=name;
//		System.out.println(name+"haha！");
		
	}
}
