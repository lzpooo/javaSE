package com.briup.client;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Collection;
import java.util.Date;
import java.util.Properties;

import com.briup.util.BIDR;
import com.briup.woss.client.Client;

/**
 * AAA服务器客户端
 */
public class ClientImpl implements Client {
	static String IP;
	static int port;

	/*
	 * 初始化操作
	 */
	@Override
	public void init(Properties prop) {
		try {
			port = Integer.parseInt(prop.getProperty("port"));
			IP = prop.getProperty("ip");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * 向服务器发送采集好的数据
	 */
	@Override
	public void send(Collection<BIDR> str) throws Exception {
		System.out.println(IP + "  " + port);
		Socket s = new Socket(IP, port);
		OutputStream os = s.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);
		// 发送BIDR
		System.out.println("qian" + new Date());
		oos.writeObject(str);
		System.out.println("hou" + new Date());
		if (oos != null) {
			oos.flush();
			oos.close();
		}
		if (s != null) {
			s.close();
		}

	}
	/**
	 * 
	 */
	/*
	 * @Test public void testtttt(){ GatherImpl gi=new GatherImpl(); try {
	 * Collection<BIDR> bidr = gi.gather(); send(bidr); } catch (Exception e) {
	 * e.printStackTrace(); } }
	 */

}
