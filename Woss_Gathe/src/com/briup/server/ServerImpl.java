package com.briup.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Properties;

import com.briup.util.BIDR;
import com.briup.woss.server.Server;

/**
 * 中央服务器
 */
public class ServerImpl implements Server {
	Collection<BIDR> bidr = null;
	ServerSocket ss = null;
	static int port;

	@Override
	public void init(Properties prop) {
		port = Integer.parseInt(prop.getProperty("port"));
	}

	@Override
	public Collection<BIDR> revicer() throws Exception {
		boolean flag = true;
		Socket client = null;
		try {
			ss = new ServerSocket(port);
			System.out.println("等待连接...");
			while (flag) {
				client = ss.accept();
				new ServerThread(client).start();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return bidr;
	}

	/*
	 * @Test public void testtt(){ ServerImpl si=new ServerImpl(); try {
	 * Collection<BIDR> revicer = si.revicer(); for(BIDR b:revicer){
	 * System.out.println(b.getAAA_login_name()); } } catch (Exception e) {
	 * e.printStackTrace(); } }
	 */

	@Override
	public void shutdown() {
		try {
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class ServerThread extends Thread {
	Socket s = null;
	Collection<BIDR> bidr = null;

	public ServerThread(Socket s) {
		this.s = s;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void run() {
		System.out.println(getName() + " accept client socket");
		try {
			InputStream is = s.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			// System.out.println(ois);
			bidr = (Collection<BIDR>) ois.readObject();
			DBStoreImpl dbStoreImpl = new DBStoreImpl();
			dbStoreImpl.saveToDB(bidr);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}

	}

}
