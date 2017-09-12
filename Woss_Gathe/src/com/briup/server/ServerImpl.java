package com.briup.server;

import java.util.Collection;
import java.util.Properties;

import com.briup.util.BIDR;
import com.briup.woss.server.Server;
/**
 * 中央服务器
 */
public class ServerImpl implements Server{

	@Override
	public void init(Properties arg0) {
	}

	@Override
	public Collection<BIDR> revicer() throws Exception {
		return null;
	}

	@Override
	public void shutdown() {
		
	}

}
