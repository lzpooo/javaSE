package com.briup.ch19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutStreamTest {

	public static void main(String[] args) {
		FileInputStream[] fis1 = new FileInputStream[10];
		FileOutputStream[] fos1 = new FileOutputStream[10];
		try {
			for (int i = 0; i < 10; i++) {
				fis1[i] = new FileInputStream("E:\\HTML.txt");

				fos1[i] = new FileOutputStream("E:\\Test" + i + ".txt");

				byte[] s = new byte[1824];
				int len1 = 0;
				while ((len1 = fis1[i].read(s)) != -1) {
					fos1[i].write(s);
				}
				fos1[i].flush();
				System.out.println(len1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				for (int i = 0; i < 10; i++) {
					if (fis1[i] != null) {
						fis1[i].close();
					}
					if (fos1[i] != null) {
						fos1[i].close();
					}
				}
			} catch (IOException e2) {
				System.out.println(e2.getMessage());
			}

		}

	}

}
