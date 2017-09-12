package com.imooc;

public class TryCatchText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchText txt =new TryCatchText();
		int result= txt.text1();
		System.out.println("text1方法执行完毕，返回值为："+ result);
	}
	public int text1(){
		int diliver = 10;
		int result = 100;
		try{
			while(diliver > -1){
			diliver--;
			result = result + 100/diliver;
			
			}
			return result;
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("程序执行出错！");
			return -1;
		}
	}

}
