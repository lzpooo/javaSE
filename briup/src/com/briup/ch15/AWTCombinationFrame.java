package com.briup.ch15;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
@SuppressWarnings("serial")
public class AWTCombinationFrame extends JFrame{
	
	JButton buttons[];
	JLabel statusLabel;
	Container contentPane;

	public AWTCombinationFrame(String title) {
		contentPane = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
		contentPane.setLayout(new BorderLayout());
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(4, 3, 5, 5));
		buttons = new JButton[12];
		for (int i=0; i<9; i+=1) {
			buttons[i] = new JButton(Integer.toString(i+1));
			centerPanel.add(buttons[i]);
		}
		buttons[9] = new JButton("*");
		buttons[10] = new JButton("0");
		buttons[11] = new JButton("#");
		centerPanel.add(buttons[9]);
		centerPanel.add(buttons[10]);
		centerPanel.add(buttons[11]);
		for (int i=0;i<12;i++){
			final int j=i;
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.out.print(buttons[j].getText());
				}
			});
		}
		contentPane.add(centerPanel, BorderLayout.CENTER);
		statusLabel = new JLabel("");
		contentPane.add(statusLabel, BorderLayout.NORTH);
		setSize(150, 230);
		setVisible(true);
	}

	public static void main(String[] args){
		new AWTCombinationFrame("AWT Combo Demo");
    }
	
}
