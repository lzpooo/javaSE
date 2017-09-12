package ch13;

import java.util.List;

/**
 * 枚举类型测试
 * @author LZP
 * @version JDK1.7.2
 * 
 * */
interface EnumSuper{
	public void test();
}

public enum Gender implements EnumSuper{
	MALE("man"){
		public  void absTest(){}
		public void test(){}
	},
	
	FEMALE("woman"){
		public  void absTest(){}
		public void test(){}
	},
	
	MAN{
		public  void absTest(){}
		public void test(){}
	};
	
	private String desc;
	
	private Gender(){
		System.out.println("in gender()");
	}
	
	private Gender(String desc) {
		this.desc=desc;
		System.out.println("in aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	}
	
	//抽象方法
	public abstract void absTest();
	
	public String getDesc() {
		return desc;
	}
	
	public static void main(String[] args){
		System.out.println(Gender.MALE);
		Gender g=Gender.MALE;
		System.out.println(g.getDesc());
		System.out.println(g.getClass());
		//List<Color> list=new 
	}
}
