package ch13;

import java.util.Set;
/**
 * 泛型测试
 * @author LZP
 * @version 1.7.2
 * 
 * */

public class Point<T1,T2> {
	private T1 x;
	private T2 y;
	public Point(){
		
	}
	public Point(T1 x,T2 y){
		this.x=x;
		this.y=y;
		
	}
	public void setX(T1 x) {
		this.x = x;
	}
	public void setY(T2 y) {
		this.y = y;
	}
	public T1 getX() {
		return x;
	}
	public T2 getY() {
		return y;
	}
}

//定义子类可以使用泛型
class GenSub<T> extends Point{
	
}
//使用泛型定义一个接口
interface GenSup<T>{
	public void test(T t);
}



