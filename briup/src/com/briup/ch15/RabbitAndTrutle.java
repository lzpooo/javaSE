package com.briup.ch15;

public class RabbitAndTrutle extends Thread {
	public RabbitAndTrutle(String name) {
		setName(name);
	}

	private static boolean isRunning = false;
	private static double a;

	public void run() {

		for (int i = 0; i < 100;) {
			a = Math.random();
			if (!isRunning) {
			if (a < 0.3&&getName().equals("兔子")) {
				i += 2;
				
					System.out.println(getName() + "已经跑了" + i+"米！");
					if (i>=100) {
						System.out.println("兔子赢了！");
						
					}
				
			} 
			if(a>=0.3&&getName().equals("乌龟")){			
					i++;
				
					System.out.println(getName() + "已经跑了" + i+"米！");
					if (i>=100) {
						System.out.println("乌龟赢了！");
						
					}
				}
			}
		}
		isRunning = true;
	}

	public static void main(String[] args) {
		System.out.println("比赛开始：");
		RabbitAndTrutle rabbit = new RabbitAndTrutle("兔子");
		RabbitAndTrutle trutle = new RabbitAndTrutle("乌龟");
		
		rabbit.start();
		trutle.start();
		

	}
}
