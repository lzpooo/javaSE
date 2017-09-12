package com.black;


public class Test2 {
//	public static void a() {
//		// 抽象类不能被实例化，所以必须用static方法实现
//		System.out.println("sad");
//	}
	
	public Test2(){
		System.out.println("a");
	}
	public void Test2(){
		System.out.println("b");
	}

//	long length;
//	public Test2(long l) {length = l;}
	public static void main(String arg[]) {
		
		
		String s="hello";
		String s1="hel";
		String s2="lo";
		String s3=s1+s2;
		String s4="hello";
		System.out.println(s==s4);
		System.out.println(s3==s);
		
		
//		Test2 c1, c2, c3;
//		c1 = new Test2(5L);
//		c2 = new Test2(5L);
//		c3 = c2;
//		long m=10L;
//		System.out.println(c1==c2 );
//		System.out.println(c2==c3);
//		//System.out.println(m==c1);
//		System.out.println(c1.equals(m));
		
	

	
//		System.out.println("                   .-' _..`. ");
//		System.out.println("                  /  .'_.'.' ");
//		System.out.println("                 | .' (.)`. ");
//		System.out.println("                 ;'   ,_   `.");
//		System.out.println(" .--.__________.'    ;  `.;-' ");
//		System.out.println("|  ./               /          ");
//		System.out.println("|  |               /           ");
//		System.out.println("`..'`-._  _____, ..'           ");
//		System.out.println("     / | |     | |\\ \\           ");
//		System.out.println("    / /| |     | | \\ \\          ");
//		System.out.println("   / / | |     | |  \\ \\         ");
//		System.out.println("  /_/  |_|     |_|   \\_\\        ");
//		System.out.println(" |__\\  |__\\    |__\\  |__\\        ");


		
		
//		String s="s";
//		s+="s";

		// String s;
		// System.out.println("S="+s);

		// String foo = args[1];
		// String bar = args[2];
		// String baz = args[3];
		// System.out.println( "baz =" + baz);
		//
		
		//+=会强转，不然要显示转换
		// short s1=1;
		// s1=(short) (s1+1);
		// s1+=1;
		
		//^相同为0不同为1
		// int a=1;
		// int b=1;
		// if(a==a^b==b){
		// System.out.println("if");
		// }
		// else{
		// System.out.println("else");
		// }
		
		//先进后出
		// int a=1;
		// a=a++;
		// System.out.println(a);
		// int b=1;
		// b=++b;
		// System.out.println(b);

		// System.out.println("asdsdfdhsdfgh");
		// // Test2 t1=new Test2();
		// //a();
		//
		// int b=0;
		// int j;
		// int[] arr={24,65,8,4,5,74,52,15,34,99};
		// for (int i = 0; i < arr.length; i++) {
		// j=i;
		// b=arr[i];
		// while(j > 0 && b<arr[j-1]){
		// arr[j]=arr[j-1];
		// j--;
		// }
		// arr[j]=b;
		// System.out.print(arr[j]+"  ");
		// }
	}
}
