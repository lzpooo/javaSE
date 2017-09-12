package com.briup.ch15;

public class Counter extends Thread {
	private Storage sto;
	public Counter(){}
	public Counter(String name,Storage sto){
		setName(name);
		this.sto=sto;
	}
	public void run(){
		System.out.println(getName()+"开始执行！");
		
		for(int i=0;i<100;i++){
			synchronized (sto) {
				sto.setA(i);
				if (sto.isFlag()) {
					
					try {
						sto.wait();
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
				sto.setFlag(true);
				sto.notify();
			}
			
		}
		
		
		System.out.println(getName()+"结束了！");
		
	}
}
