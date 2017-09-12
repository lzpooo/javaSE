package ch10;

//import java.awt.List;
import java.util.*;

//import java.util.Collection;

public class Test1 {

	public static void main(String[] args) {
		stringListTest("aslkiyfeiwaugfsigbvfqwaufudcs");

	}

	public static void stringListTest(String str) {

		char[] c = str.toCharArray();
		List<Character> list = new ArrayList<Character>();

		for (Character c1 : c) {
			if (list.contains(c1)) {
				continue;
			} else {
				list.add(c1); 
			}
		}
		Iterator<Character> i = list.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}

		/*
		 * List list=new ArrayList(); int a; int sum=1; for(int i=1;i<11;i++){
		 * list.add(i);
		 * 
		 * } for (int i = 0; i < list.size(); i++) { a=(int)list.get(i); sum
		 * *=a; } System.out.println("sum="+sum);
		 */

		/*
		 * List list=new ArrayList(); for(int i=0;i<10;i++){ list.add(i); }
		 * Iterator inte=list.iterator(); while(inte.hasNext()){
		 * System.out.print((inte.next()).toString()+"  ");
		 * 
		 * } System.out.println();
		 * 
		 * for(int j=0;j<10;j++){ int a; a=(int)(list.get(j));
		 * System.out.print(a+"  "); } Object[] a=list.toArray();
		 * System.out.println(); for(int i=0;i<a.length;i++){
		 * System.out.print(a[i]+"  ");
		 * 
		 * }
		 */

		/*
		 * Integer obj=new Integer(145);//基本类型------>包装器类
		 * 
		 * int num=obj.intValue();//包装器类------>基本类型
		 * 
		 * Integer obj1=new Integer("35");//字符串------>包装器类
		 * 
		 * String string=obj.toString();//包装器类------>字符串包装器类
		 * 
		 * int num1=Integer.parseInt("56");//字符串------>基本类型
		 * 
		 * String string2=String.valueOf(5);//基本类型------>字符串包装器类
		 * 
		 * System.out.println((obj)+"  "+(num)+"  "+(obj1)+"  "+(string)+"  "+(num1
		 * )+"  "+(string2));
		 */

		// Set set =new HashSet();
		// for (int i=0;i<20;i++){
		// set.add(i);
		// }
		// Iterator iterator=set.iterator();
		// while (iterator.hasNext()){
		// System.out.print((iterator.next()).toString()+" ");
		// }

		// TODO Auto-generated method stub
		// List list=new LinkedList();
		// for (int i=0;i<20;i++){
		// list.add(i);
		// }
		// System.out.println(list.toString());
		// System.out.println(list.get(8));

	}

	@Override
	public String toString() {
		return "Test1 [getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
