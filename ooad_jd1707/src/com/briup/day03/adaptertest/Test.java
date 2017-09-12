package com.briup.day03.adaptertest;
/**
 * 适配器模式
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Action a=new Action();
		C work=new C(a);
		Snippet s=new Snippet();
		s.go(work);
	}
}
