package com.briup.day06xml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 使用sax解析用户xml文件
 * @author Administrator
 *
 */
public class SaxUser {
	private List<User> user;
	private User users;
	public List<User> readUser(String filePath){
		user=new ArrayList<>();
		try {
			// 第一步：获取sax解析工厂对象
			SAXParserFactory factory = SAXParserFactory.newInstance();
			// 第二步：获取sax解析器对象
			SAXParser parser = factory.newSAXParser();
			//第三步：利用解析器对象解析xml文件
			parser.parse(filePath,new DefaultHandler(){

				String cuurentQname;
				@Override
				public void startDocument() throws SAXException {
					System.out.println("文档开始解析");
				}

				@Override
				public void endDocument() throws SAXException {
					System.out.println("文档解析结束");
				}

				@Override
				public void startElement(String uri, String localName,
						String qName, Attributes attributes)
						throws SAXException {
					//元素开始解析
					this.cuurentQname=qName;
					if(qName.equals("user")){
						users=new User();
						String name=attributes.getValue("name");
						users.setName(name);
					}
				}

				@Override
				public void endElement(String uri, String localName,
						String qName) throws SAXException {
					//元素结束解析
					if(qName.equals("user")){
						user.add(users);
					}
					this.cuurentQname=null;
				}

				@Override
				public void characters(char[] ch, int start, int length)
						throws SAXException {
					//获取元素内容
					String text=new String(ch,start,length);
					if("user".equals(cuurentQname)){
						users.setAccount(Double.valueOf(text));
					}
				}
				
			});
		} catch (ParserConfigurationException e) {
			
			e.printStackTrace();
		} catch (SAXException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return user;
	}
	
	public static void main(String[] args) {
		List<User> stu = new SaxUser().readUser("src/com/briup/day06xml/User.xml");
		Map map=new HashMap();
		for(int i=0;i<stu.size();i++){
			String[] str=(stu.get(i).toString()).split(",");
			map.put(str[0],str[1]);
		}
		Set set1=map.keySet();
		Iterator iterator2=set1.iterator();
		for(;iterator2.hasNext();){
			Object object=iterator2.next();
			System.out.println(object+"  "+map.get(object));
		}
		
	}
	
	
}
