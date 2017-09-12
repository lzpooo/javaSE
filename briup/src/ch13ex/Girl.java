package ch13ex;

import java.util.HashSet;
import java.util.Set;

public class Girl {
	private String name;
	private Set<EmotionListener> set=new HashSet<EmotionListener>();
	public Girl(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void addEmotionaListener(EmotionListener l){
		set.add(l);
	}
	public void removeEmotionaListener(EmotionListener l){
		set.remove(l);
	}
	
	
	public void happy(){
		EmotionEvent e=new EmotionEvent(this);
		for(EmotionListener l:set){
			//l.happy(e);
		}
	}
	public void addBoy(){
		//set.add();
	}
}
