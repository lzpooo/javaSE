package com.briup.day03.composite;
/**
 * 组合模式，树结构
 * @author Administrator
 *
 */
public class Test{

		public static void main(String[] args) {  
			Tree tree = new Tree("根目录");  
			TreeNode nodeB = new TreeNode("文件夹1");  
			TreeNode nodeC = new TreeNode("文件夹2");  
			  
			nodeB.add(nodeC);  
			tree.root.add(nodeB);  
			System.out.println("build the tree finished!");  
		}
	}