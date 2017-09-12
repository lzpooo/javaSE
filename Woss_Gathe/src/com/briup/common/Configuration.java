package com.briup.common;

import com.briup.util.BackUP;
import com.briup.util.Logger;
import com.briup.woss.client.Client;
import com.briup.woss.client.Gather;
import com.briup.woss.server.DBStore;
import com.briup.woss.server.Server;
/**
 * 配置模块
 */
public class Configuration implements com.briup.util.Configuration{

	@Override
	public BackUP getBackup() throws Exception {
		return null;
	}

	@Override
	public Client getClient() throws Exception {
		return null;
	}

	@Override
	public DBStore getDBStore() throws Exception {
		return null;
	}

	@Override
	public Gather getGather() throws Exception {
		return null;
	}

	@Override
	public Logger getLogger() throws Exception {
		return null;
	}

	@Override
	public Server getServer() throws Exception {
		return null;
	}

}
