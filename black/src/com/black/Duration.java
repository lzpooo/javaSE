package com.black;
public class Duration 
{
	private int hours,minutes,seconds;

	public int getAllSeconds(int hours,int minutes ,int seconds){
		this.hours=hours;
		this.minutes=minutes;
		this.seconds=seconds;
		int AllSeconds=3600*hours+60*minutes+seconds;
		System.out.println(AllSeconds);
		return AllSeconds;
	}
	public int getHours(){
		return hours;
		
	}

	public void setHours(int hours){
		this.hours=hours;
	}

	public int getMinutes(){
		return minutes;
	}

	public void setMinutes(int minutes){
		this.minutes=minutes;
	}

	public int getSeconds(){
		return seconds;
	}

	public void setSeconds(int seconds){
		this.seconds=seconds;
	}

	public int getTotalSeconds(){
		return hours*3600+60*minutes+seconds;
	}

	public String toString(){
		return hours + ":" + minutes + ":" + seconds;
	}
	
}