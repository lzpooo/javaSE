package com.briup.server;
/**
 * @author LZP
 * @version 1.0
 * 初始化Server Socket
 * 对客户端的请求进行处理
 * 
 * */
public interface IServer {
	//初始化服务器端
	public void init();
	//对客户端请求进行处理
	public void receive();
}
