package com.briup.day03.proxytest;

public class Actor {
	private String actorName;
	private String actorPermission;

	public Actor(String actorName, String actorPermission) {
		this.actorName = actorName;
		this.actorPermission = actorPermission;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getActorPermission() {
		return actorPermission;
	}

	public void setActorPermission(String actorPermission) {
		this.actorPermission = actorPermission;
	}

}
