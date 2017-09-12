package com.briup.client;

import java.util.Collection;
import java.util.Properties;

import com.briup.util.BIDR;
import com.briup.woss.client.Client;

/**
 * AAA服务器客户端
 */
public class ClientImpl implements Client{

	/*
	 *初始化操作
	 */
	@Override
	public void init(Properties arg0) {
	}
	
	/*
	 *向服务器发送采集好的数据
	 */
	@Override
	public void send(Collection<BIDR> arg0) throws Exception {
		
	}

}
