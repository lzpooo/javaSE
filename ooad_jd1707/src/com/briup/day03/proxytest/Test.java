package com.briup.day03.proxytest;
/**
 * 代理模式
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Actor lzp = new Actor("LZP", "admin");
		Actor son = new Actor("son", "visitor");
		ProxyUser user = new ProxyUser(new User());
		user.showUsersInfo(lzp);
		user.showUsersInfo(son);
	}
}
