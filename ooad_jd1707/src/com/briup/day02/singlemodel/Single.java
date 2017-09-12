package com.briup.day02.singlemodel;

/**
 * 单例模式/饿汉模式/懒汉模式
 * 
 * @author LZP
 *
 */
public class Single {
	private static class SingleFactory {
		public static Single getInstence() {
			return new Single();
		}
	}

	private static Single single = null; // 饿汉：new Single();

	private Single() {
		
	};

	public static Single getInstance() {

		// if(single==null){
		// synchronized (single) {
		// if(single==null){
		// return new Single();//原子操作
		// }
		// }
		// }
		return SingleFactory.getInstence();
	}

	private Object readResolver() {
		return SingleFactory.getInstence();
	}

}
