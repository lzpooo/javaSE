package com.briup.day06xml.dom4j;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;


/**
 * 使用dom4j解析student文件
 * @author Administrator
 *
 */
public class Dom4jParse {
	
	public void dom4jParse(String fileName){
		//获得文档对象
		Document document = DocumentHelper.createDocument();
		//添加根元素
		Element root = document.addElement("students");
		
		//根元素下面添加子元素及其属性
		Element student = root.addElement("student");
		student.addAttribute("id", "1");
		
		Element name = student.addElement("name");
		name.addText("tom");
		
		Element age = student.addElement("age");
		age.addText("18");
		
		Element address = student.addElement("address");
		Element city = address.addElement("city");
		city.addText("上海");
		try {
			//输出格式化xml
			OutputFormat format = OutputFormat.createPrettyPrint();
			XMLWriter xw = new XMLWriter(new FileOutputStream(new File(fileName)),format);
			xw.write(document);
			xw.flush();
			xw.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public void readXml(String fileName){
		
		try {
			//获得一个SAXReader对象
			SAXReader reader = new SAXReader();
			//读取这个要解析的xml文件
			File file = new File(fileName);
			//获得document中的根节点
			Document document = reader.read(file);
			//获得根节点下面所有的子节点
			Element rootElement = document.getRootElement();
			//获得根节点下面所有的子节点
			List<Element> elements = rootElement.elements();
			//遍历elements集合,拿到每一个子节点
			for(Element e:elements){
				String s=e.attributeValue("id");
				System.out.println(e.getName()+"节点的id属性的值为:"+s);
				List<Element> elements2 = e.elements();
				//遍历elements2集合,拿到每一个子节点
				for(Element e2:elements2){
					List<Element> elements3=e2.elements();
					//输出每一个节点名及其文本
					System.out.println(e2.getName()+" : "+e2.getText());
					//遍历element3，拿到其每个子节点
					for(Element e3:elements3){
						System.out.println(e3.getName()+" : "+e3.getText());
					}
				}
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		Dom4jParse t = new Dom4jParse();
		String filePath = "src/com/briup/day06xml/dom4j/student.xml";
		t.readXml(filePath);
		String file = "src/com/briup/day06xml/dom4j/student1.xml";
		t.dom4jParse(file);
	}
	
}
