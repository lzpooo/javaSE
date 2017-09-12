package com.briup.day03.adaptertest;
public class C implements Work{
	private Action action;
	public C(Action action){
		this.action=action;
	}
	public void doStart(){
		System.out.println("开始！");;
	};
	public void doRun(){
		action.run();
	};
	public void doEnd(){
		System.out.println("结束！");;
	};

}