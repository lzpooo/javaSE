package com.briup.ch14;

import java.awt.*;
import java.awt.datatransfer.FlavorEvent;

import javax.swing.*;
public class FirstGUI  {
	private JFrame frame;
	private JTextField firstTxt;
	private JTextField secondTxt;
	private JLabel lab;
	private JButton btn;
	private JTextField resTxt;
	public FirstGUI(){
		frame=new JFrame("helloworld!");
		//frame.setTitle("first!");
		frame.setVisible(true);
		frame.setBounds(100, 100, 500, 500);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new FirstGUI();
		System.out.println("c");
	}
//	private void init(){
//		frame.setLayout(new FlowLayout());
//		frame.setVisible(true);
//		firstTxt=new JTextField();
//		lab=new JLabel(" + ");
//		secondTxt=new JTextField();
//		btn=new JButton(" = ");
//		resTxt=new JTextField();
//		frame.add(firstTxt);
//		frame.add(lab);
//		frame.add(secondTxt);
//		frame.add(btn);
//		frame.add(resTxt);
//		
//	}
}
