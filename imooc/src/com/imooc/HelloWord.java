package com.imooc;
import java.util.Scanner;
import java.util.Arrays;
public class HelloWord {
      public static void main(String[] args){
    	  HelloWord hello = new HelloWord();           
          // 调用方法并将返回值保存在变量中
          int maxScore=  hello.getMaxAge();
  		System.out.println("最大年龄为：" + maxScore);
  	}

  	// 定义一个返回值为double类型的方法
      public int getMaxAge() {
    		int[] ages= {18,23,21,19,25,29,17};
    		int max= ages[0];
    		for(int i=0; i<ages.length;i++){
    		    if (max<=ages[i]){
    		        max=ages[i];
    		    }
    		}
    	    return max;
      }
}
    	    
  

