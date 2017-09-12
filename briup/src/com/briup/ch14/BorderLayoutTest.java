package com.briup.ch14;

import java.awt.*;

import javax.swing.*;

public class BorderLayoutTest extends JFrame {
	
	private JLabel northLab;
	private JTextArea westTxt;
	private JTextArea eastTxt;
	private JLabel centerLab;
	private JButton leftBtn;
	private JButton rightBtn;
	private JButton clearBtn;
	public BorderLayoutTest(){
		setTitle("helloworld!");
		setBounds(100, 100, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
	}
	private void init(){
		setLayout(new BorderLayout());
		northLab=new JLabel("operation:");
		add(northLab);
		westTxt=new JTextArea();
		add(westTxt);
		eastTxt=new JTextArea();
		add(eastTxt);
		centerLab=new JLabel();
		add(centerLab);
		leftBtn=new JButton();
		add(leftBtn);
		rightBtn=new JButton();
		add(rightBtn);
		clearBtn=new JButton();
		add(clearBtn);
	}
	
	public static void main(String[] args) {
		new BorderLayoutTest();
	}
}
