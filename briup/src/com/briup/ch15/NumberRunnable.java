package com.briup.ch15;

public class NumberRunnable implements Runnable {
	private int i=1;
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (;i<101;i++){
			System.out.println(Thread.currentThread().getName()+" i:"+i);
			if (i==20) {
				try {
					Thread.currentThread().sleep(10000);
				} catch (InterruptedException e) {
					// TODO: handle exception
				}
			}
		}
		
	}
	public static void main(String[] args) {
		System.out.println("mainstart");
		NumberRunnable nr=new NumberRunnable();
		
		Thread th1=new Thread(nr);
		th1.start();
		Thread th2=new Thread(nr);
		th2.start();
		System.out.println("mainend");
	}

}
