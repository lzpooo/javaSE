package ch10;


import java.security.KeyStore.Entry;
import java.util.*;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 str=new Test4("asdfgregdsklaergtklaheiflsdhg");
		
		
		
	}
	public  Test4(String str){
		char[] c=str.toCharArray();
		Map map1=new HashMap();
		int num=0;
		for(int i=0;i<c.length;i++){
			if(map1.containsKey(c[i])){
				
				num=(Integer)map1.get(c[i]);
				num++;
				map1.put(c[i], num);
				
				
			}
			else{
				map1.put(c[i], 1);
			}
			
			
		}
		Set set=map1.keySet();
		for( Object object:set){
			Character character= (Character) object;
			System.out.println(character+ " "+map1.get(character));
			
			
		}
		
		
		
		
	}
	

}
