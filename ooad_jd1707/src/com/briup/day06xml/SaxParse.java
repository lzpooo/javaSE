package com.briup.day06xml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 使用sax解析xml文件
 * 
 * @author Administrator
 *
 */
public class SaxParse {
	private List<Student> stus;
	private Student stu;

	public List<Student> read(String filePath) {
		stus = new ArrayList<>();
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
					System.out.println("文档结束解析");
					
				}

				/*
				 * uri:命名空间;
				 * localName:去除前缀名;
				 * qName:带前缀名;
				 * attributes:属性;
				 * 
				 * */
				@Override
				public void startElement(String uri, String localName,
						String qName, Attributes attributes)
						throws SAXException {
					this.cuurentQname=qName;
					//System.out.println("元素开始解析");
					if(qName.equals("stu")){
						stu=new Student();
						String id = attributes.getValue("id");
						stu.setId(Long.valueOf(id));//parsetLong();
						
					}
					
				}

				@Override
				public void endElement(String uri, String localName,
						String qName) throws SAXException {
					//System.out.println("元素结束解析");
					if(qName.equals("stu")){
						stus.add(stu);
					}
					this.cuurentQname=null;
				}

				@Override
				public void characters(char[] ch, int start, int length)
						throws SAXException {
					//System.out.println("获取元素内容");
					String text=new String(ch,start,length);
					if("name".equals(this.cuurentQname)){
						stu.setName(text);
					}else if("age".equals(this.cuurentQname)){
						stu.setAge(Integer.parseInt(text));
					}
				}
				
			} );
		} catch (ParserConfigurationException e) {
			
			e.printStackTrace();
		} catch (SAXException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		return stus;

	}
	
	public static void main(String[] args) {
		List<Student> stu = new SaxParse().read("src/com/briup/day06xml/student.xml");
		System.out.println(stu.toString());
	}
	
	
	
	
}
