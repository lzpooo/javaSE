package com.briup.day03.proxytest;

public class ProxyUser implements Permission{
	
	private User user;
	
	public ProxyUser(User user){
		this.user=user;
	}
	
	@Override
	public void showUsersInfo(Actor actor) {
		if(actor.getActorPermission().equals("admin")){
			user.showUsersInfo(actor);
		}
		else{
			System.out.println("对不起！"+actor.getActorName()+"您没有查看权限！");
		}
		
	}

}
