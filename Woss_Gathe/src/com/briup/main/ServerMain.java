package com.briup.main;

import com.briup.common.Configuration;

/**
 * 服务器端
 */
public class ServerMain {
	public static void main(String[] args) {
		System.out.println("这是服务器：  ");
		try {
			new Configuration().getServer().revicer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
