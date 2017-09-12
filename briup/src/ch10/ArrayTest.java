package ch10;
import java.util.*;
public class ArrayTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getArrayListTest("dskjagfilewgilcgvwkebvkcxgdfklabvkfdjsmhgfilhdgjf");

	}
	public static void getArrayListTest(String str){
		char[] c=str.toCharArray();
		/*for (int i=0;i<c.length-1;i++){
			int num=1;
			for(int j=i+1;j<c.length;j++){
				if(c[i]==c[j]){
					num++;
				}
			}
			System.out.println(c[i]+"出现了"+num+"次！");
		}
		*/
		
		
		Set<Character> set=new TreeSet<Character>();
		for (Character c2:c){
			set.add(c2);
			
		}
		Iterator iterator=set.iterator();
		while (iterator.hasNext()){
			System.out.print(iterator.next()+"  ");
		}
		
		
		List<Character> list=new ArrayList<Character>();
		
		for(Character c1:c){
			list.add(c1);
		}
		for(Character c2:c){
			getRemove(c2, list, 0);
			System.out.println(c2+"出现了"+"次！");
		}
	}
	public static void getRemove(char c,List<Character> list,int num){
		
		list.remove(c);
		num=num++;
		
			
			
		
		
//		for(Character ch:list){
//			System.out.print(ch+"  ");
//		}
	}

}
