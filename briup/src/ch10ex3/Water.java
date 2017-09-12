package ch10ex3;

public class Water {
	@SuppressWarnings("unused")
	private double weight;
	public Water(){
		
	}
//	public double getWeight(){
//		return weight;
//	}
//	public void setWeight(double weight){
//		this.weight=weight;
//	}
	
	public Water(double weight){
		this.weight=weight;
		
	}
	public void getWater(double weight){
		System.out.println("你抽取了"+weight+"吨水");
		
		
	}
}
