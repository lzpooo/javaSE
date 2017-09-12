package ch10ex3;

public class Pillar {
	private double underArea;
	private double height;
	public Pillar(){
		
	}
	public Pillar(double underArea,double height){
		this.underArea=underArea;
		this.height=height;
	}
	//获取柱体体积
	public double volume(){
		return underArea*height;
	}
}
