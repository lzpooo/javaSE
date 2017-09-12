package com.briup.ch14;

import java.awt.*;

import javax.swing.*;

public class AWTFrame extends JFrame {
	private JFrame frame;
	private JLabel lab;

	private JButton leftBtn;
	private JButton rightBtn;

	public AWTFrame() {
		setTitle("helloworld!");
		setBounds(100, 100, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
	}

	public void init(){
		setLayout(new BorderLayout());
		lab=new JLabel("operation:");
		add(lab,BorderLayout.NORTH);

		JPanel pan=new JPanel();
		add(pan,BorderLayout.SOUTH);
		pan.setLayout(new FlowLayout());
		leftBtn=new JButton("确定");
		pan.add(leftBtn);
		rightBtn=new JButton("取消");
		pan.add(rightBtn);
	 }

	public static void main(String[] args) {
		new AWTFrame();
	}
}
