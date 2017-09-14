package com.briup.main;

import java.util.Collection;

import com.briup.common.Configuration;
import com.briup.util.BIDR;

/**
 * 客户端
 */
public class ClientMain {
	public static void main(String[] args) {
		System.out.println("这是客户端。。。");
		try {
			Collection<BIDR> bidr = new Configuration().getGather().gather();
			new Configuration().getClient().send(bidr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
