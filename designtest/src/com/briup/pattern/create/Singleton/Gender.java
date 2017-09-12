package com.briup.pattern.create.Singleton;

public enum Gender {
	M;
	private Object readResolve() {  
	    return M;  
	}  
}
