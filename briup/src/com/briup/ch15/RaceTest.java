package com.briup.ch15;

public class RaceTest extends Thread {
	private static boolean isRanning=false;
	public RaceTest(String name){
		setName(name);
	}
	public void run(){
		for(int i=1;i<101;i++){
			if(!isRanning){
				System.out.println(getName()+"  run"+i);
			}	
//			if (i==20) {
//				System.out.println("停一下!");
//				try {
//					sleep(10000);
//				} catch (InterruptedException e) {
//					// TODO: handle exception
//					e.printStackTrace();
//				}
//			}
		}
		isRanning=true;
	}
	public static void main(String[] args) {
		System.out.println("mainStart!");
		RaceTest rubbit=new RaceTest("兔子");
		RaceTest turtle=new RaceTest("乌龟");
		System.out.println("启动时兔子死了没："+rubbit.isAlive());
		rubbit.start();
		//rubbit.interrupt();
		turtle.start();
		//turtle.interrupt();
//		try {
//			rubbit.join();
//			turtle.join();
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//		}
		System.out.println("结束时兔子死了没："+rubbit.isAlive());
		System.out.println("mainEnd!");
	}
}
