package com.briup.socket;

import java.awt.*;
import java.awt.event.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


@SuppressWarnings("serial")
public class ChatClient extends Frame{
	
	DataInputStream dis =null;
	DataOutputStream dos = null;
	
	private boolean bConnected =false;
	
	Socket s=null;
	
	TextField tfTextField=new TextField();//输入框
	
	TextArea tArea=new TextArea();//显示框

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatClient chatClient =new ChatClient();
		chatClient.launchFrame();
	}
	
	public void launchFrame () {
		
		//setTitle("Client"+ChatServer.clientNum);
		setLocation(400, 300);
		this.setSize(300, 300);//窗口大小
		add(tfTextField, BorderLayout.SOUTH);//添加输入框在下方
		add(tArea,BorderLayout.NORTH);//添加显示框在上方
		pack();
		/*
		 * 添加关闭窗口
		 */
		this.addWindowListener(new WindowAdapter(){
			
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
				disconnect();//关闭流
			}
		});
		tfTextField.addActionListener(new tfListener());//添加回车键	
		setVisible(true);//取消间隔
		connected();
		
		new Thread(new RecvThread()).start();
	}
    
	public void disconnect(){
		try {
			dos.close();
			dis.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}				
	}
	
	public void connected(){
		
		try{ 
		     s = new Socket("172.16.4.61", 8888);
             dos=new DataOutputStream(s.getOutputStream());
             dis =new DataInputStream(s.getInputStream());
System.out.println("connected！");
             bConnected=true;
		}catch(UnknownHostException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private class tfListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String str =tfTextField.getText().trim();
			//tArea.setText(str);
			tfTextField.setText("");			
			try{			     
			     dos.writeUTF(str);
			     dos.flush();
			     //dos.close();
			}catch(IOException e1){
				e1.printStackTrace();
			}
		}		
	}

	private class RecvThread implements Runnable{

		@Override
		public void run() {
			try{
				while(bConnected){
					String str =dis.readUTF();	
					//System.out.println(str);
					tArea.setText(tArea.getText()+str+"\n");
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}		
	}
	
}
