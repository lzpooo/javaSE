package com.briup.ch15;



class Calulate extends Thread{
	private Result res;
	public Calulate(String name,Result res){
		setName(name);
		this.res=res;
	}
	public void run(){
		System.out.println(getName()+"  run");
		int sum=0;
		for (int i = 1; i <101; i++) {
			sum+=i;
		}
		res.setVal(sum);
		res.setFlag(true);
		System.out.println(getName()+"  end");
		synchronized (res) {
			res.notifyAll();
		}
	}
}

class Printer extends Thread{
	private Result res;
	public Printer(String name,Result res){
		setName(name);
		this.res=res;
	}
	public void run(){
		System.out.println(getName()+"  run");
		while (!res.isFlag()){
			synchronized (res) {
				try {
					res.wait();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
				
			}
		}
		System.out.println(getName()+"  res="+res.getVal());
	}
}

public class CalTest {
	public static void main(String[] args) {
		Result res=new Result();
		Calulate cal=new Calulate("cal", res);
		Printer pri=new Printer("pri", res);
		cal.start();
		pri.start();
		//pri.yield();
		
	}
}
