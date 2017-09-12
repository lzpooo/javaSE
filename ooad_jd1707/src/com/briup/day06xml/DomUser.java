package com.briup.day06xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * dom解析user类
 * @author Administrator
 *
 */
public class DomUser {
	private List<User> list1;
	private User u;
	
	public List<User> domRead(String fileName)throws Exception{
		list1=new ArrayList<>();
		// 获得一个负责生产DocumentBuilder对象的工厂实例
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		// 设置是否支持命名空间
		factory.setNamespaceAware(true);
		// 通过工厂获得一个DocumentBuilder对象，可以通过这个对象获得document对象
		DocumentBuilder builder = factory.newDocumentBuilder();
		// 获得document对象，它可以表示一个文档，例如xml文档
		Document document = builder.parse(fileName);
		// 获得这个文档的根元素
		Element root = document.getDocumentElement();
		// 获得根元素的子元素
		NodeList rootChildNodes = root.getChildNodes();
		for (int i = 0; i < rootChildNodes.getLength(); i++) {
			// 获取每一个stu子节点
			Node node = rootChildNodes.item(i);
			//判断子节点类型是不是元素类型
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				u = new User();
				//
				getUInfo(node, u);
				// 获取stu元素的子节点
				NodeList uChildNodes = node.getChildNodes();
				for (int j = 0; j < uChildNodes.getLength(); j++) {
					Node uNode = uChildNodes.item(j);
					if (uNode.getNodeType() == Node.ELEMENT_NODE) {
						getUInfo(uNode, u);
						}
					}
					list1.add(u);
				}

			}
		return list1;
		
	}
	
	public void getUInfo(Node node, User user) {
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			if ("user".equals(node.getNodeName())) {
				// 获取属性节点值
				String name = node.getAttributes().getNamedItem("name")
						.getNodeValue();
				user.setName(name);
				String account = node.getTextContent();
				user.setAccount(Double.parseDouble(account));
			}  
		}

	}
	
	public static void main(String[] args) {
		DomUser dp=new DomUser();
		try {
			
			List<User> list=dp.domRead("src/com/briup/day06xml/user.xml");
			for(User st:list){
				System.out.println(st);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
}
