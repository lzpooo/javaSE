package ch13ex;

//事件对象
public class EmotionEvent {
	private Object source;
	public EmotionEvent(Object source){
		this.source=source;
	}
	public void setSource(Object source) {
		this.source = source;
	}
	public Object getSource() {
		return source;
	}
	
}
