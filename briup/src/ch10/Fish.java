package ch10;

public class Fish extends Animal implements Pet {
	private String name;
	public Fish(){
		
	}
	public void work() {
		System.out.println("鱼在游！");
		
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("鱼在玩！");
	}

	
	public void eat() {
		System.out.println("鱼在吃！");

	}

}
