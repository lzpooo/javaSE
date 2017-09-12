package com.briup.ch14;
import java.awt.*;
import javax.swing.*;
public class AWTCombinationFrame extends JFrame{
	private JFrame frame1;
	private JLabel lab;
	
	public AWTCombinationFrame(){
		setTitle("helloworld!");
		setBounds(100,100,300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init1();
	}
	public void init1(){
		setLayout(new BorderLayout());
		lab=new JLabel("operation:");
		add(lab,BorderLayout.NORTH);
		JPanel pan=new JPanel();
		add(pan,BorderLayout.CENTER);
		pan.setLayout(new GridLayout(4,4));
		for(int i=1;i<=9;i++){
			JButton btn1=new JButton(i+"  ");
			pan.add(btn1);
		}
		JButton btn4=new JButton("0");
		JButton btn2=new JButton("*");
		JButton btn3=new JButton("#");
		pan.add(btn2);
		pan.add(btn4);
		pan.add(btn3);
		



	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AWTCombinationFrame();
	}

}
