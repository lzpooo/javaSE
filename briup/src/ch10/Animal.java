package ch10;

abstract class Animal {
	
	protected int legs;
	public Animal(){
		
	}
	protected Animal(int legs){
		this.legs = legs;
	}
	public void work(){
		System.out.println("动物可以行走！");
		
	}
	public abstract void eat();
}
