package com.briup.ch15;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class AWTFrame extends JFrame {
	 JFrame frame=new JFrame();
	public JButton panicButton, okButton;
    public  JLabel statusLabel;
	Container contentPane;

	public AWTFrame(){}
	public AWTFrame(String aTitle) {
		
		contentPane = getContentPane();
		setTitle(aTitle);
		contentPane.setLayout(new BorderLayout());

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		panicButton = new JButton("cancel");
		buttonPanel.add(panicButton);
		okButton = new JButton("ok");
		buttonPanel.add(okButton);
		contentPane.add(buttonPanel, BorderLayout.CENTER);
		statusLabel = new JLabel("Ready?");
		contentPane.add(statusLabel, BorderLayout.SOUTH);
		setSize(200, 100);
		setVisible(true);
	
		init();
	}
	
	public void init(){
		panicButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("button1!");
			}
		});
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("button2!");
			}
		});
		
	}

	public static void main(String args[]) {
		new AWTFrame("AWT Example");
		
	}
}
