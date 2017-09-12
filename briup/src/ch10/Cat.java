package ch10;

public class Cat extends Animal implements Pet {

	private String name;
	public Cat(String name){
		this.name=name;
	}
	public Cat(){
		
	}
	public String getName() {
		
		return name;
	}

	
	public void setName(String name) {
		this.name=name;

	}

	
	public void play() {
		System.out.println("猫在玩!");

	}


	public void eat() {
		System.out.println("猫在吃！");

	}

}
