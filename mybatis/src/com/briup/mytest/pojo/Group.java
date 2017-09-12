package com.briup.mytest.pojo;

import java.util.List;

/**
 * 练习二：group类
 * @author LZP
 * 2017年9月10日
 */
public class Group {
	private Integer groupId;
	private String groupName;
	private List<User> user;
	public Group(Integer groupId, String groupName, List<User> user) {
		this.groupId = groupId;
		this.groupName = groupName;
		this.user = user;
	}
	public Group(String groupName, List<User> user) {
		this.groupName = groupName;
		this.user = user;
	}
	public Group() {
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Group [groupId=" + groupId + ", groupName=" + groupName
				+ ", user=" + user + "]";
	}
	
}
