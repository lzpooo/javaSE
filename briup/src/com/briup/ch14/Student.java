package com.briup.ch14;

public class Student extends Man{
	private int id;
	
	private double score;
	private String  name;
	private Man man;
	public Student(){
		
	}
	public Student(int id,String name,double score){
		this.id=id;
		this.name=name;
		this.score=score;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getScore() {
		return score;
	}
	@Override
	public String toString() {
		return "Student [id=" + getId() + ", name=" + getName() + ", score=" + getScore()
				+ "]";
	}
}
