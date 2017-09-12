package com.briup.day02.factorymodel;
/**
 * 工厂接口
 * @author LZP
 *
 */
public interface Factory {
	/**
	 * 生产水果
	 * @return
	 */
	public Fruit provider();
}
