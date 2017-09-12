package com.briup.day03.proxytest;

public class User implements Permission {

	@Override
	public void showUsersInfo(Actor actor) {
		System.out.println(actor.getActorName()+"查看了信息！");
		
	}

}
