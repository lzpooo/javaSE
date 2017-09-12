package com.briup;

import java.util.*;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 4, 3, 6, 8, 1, 2, 7, 9, 5 };
		for (int i = 0; i < a.length - 1; i++) {
			//用于存储最大数的地址
			int b = i;
			for (int j = b + 1; j <a.length; j++) {

				if (a[j] < a[b]) {
					b = j;
				}

			}
			if (i != b) {
				int c = a[i];
				a[i] = a[b];
				a[b] = c;
			}

		}
		System.out.print(Arrays.toString(a));
	}

}
