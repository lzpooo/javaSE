package com.black;

public class Track {
	private String title;
	private Duration duration=new Duration();
	
	public void Track(String title,Duration duration){
		this.title=title;
		this.duration=duration;
	}

	public String getTitle(){
		return title;
	}

	public void setTitle(String title){
		this.title=title;
	}

	public Duration getDuration(){
		return duration;
	}

	public void setDuration(Duration duration){
		this.duration=duration;
	}

	public String toString(){
		return "my Track title is: " + title + " duration is: " + duration;
	}
}  

