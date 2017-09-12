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
 * 使用dom解析解析xml文件
 * 
 * @author Administrator
 *
 */
public class DomParse {
	private List<Student> lstu;
	private Student stud;

	public List<Student> read(String fileName) throws Exception {
		lstu = new ArrayList<>();

		// 获得一个负责生产DocumentBuilder对象的工厂实例
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		// 设置是否支持命名空间
		factory.setNamespaceAware(true);
		// 通过工厂获得一个DocumentBuilder对象，可以通过这个对象获得document对象
		DocumentBuilder builder = factory.newDocumentBuilder();

		// 如果是xml上面声明了对DTD的引用,则可以这样忽略掉DTD,否则会自动根据地址查找DTD
		/*
		 * builder.setEntityResolver(new EntityResolver() {
		 * 
		 * @Override public InputSource resolveEntity(String publicId, String
		 * systemId) throws SAXException, IOException { byte[] data =
		 * "<?xml version=\"1.0\" encoding=\"UTF-8\"?>".getBytes(); return new
		 * InputSource(new ByteArrayInputStream(data)); } });
		 */

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
				stud = new Student();
				//
				getStuInfo(node, stud);
				// 获取stu元素的子节点
				NodeList stuChildNodes = node.getChildNodes();
				for (int j = 0; j < stuChildNodes.getLength(); j++) {
					Node stuNode = stuChildNodes.item(j);
					if (stuNode.getNodeType() == Node.ELEMENT_NODE) {
						getStuInfo(stuNode, stud);
					}
				}
				lstu.add(stud);
			}

		}
		return lstu;

		// 第一步：生成document对象
		// 第二步：获取根元素 getDocumentElement();
		/**
		 * getChildNodes();获取所有子节点
		 * getChildNodes().getLength();获取列表的长度
		 * getChildNodes().getItem();获取单个节点
		 * 
		 */

	}

	public void getStuInfo(Node node, Student stu) {
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			if ("stu".equals(node.getNodeName())) {
				// 获取属性节点值
				String id = node.getAttributes().getNamedItem("id")
						.getNodeValue();
				stu.setId(Long.parseLong(id));
			} else if ("name".equals(node.getNodeName())) {
				// 获取节点的文本内容
				String name = node.getTextContent();
				stu.setName(name);
			} else if ("age".equals(node.getNodeName())) {
				String age = node.getTextContent();
				stu.setAge(Integer.parseInt(age));
			}
		}

	}
	
	public static void main(String[] args) {
		DomParse dp=new DomParse();
		try {
			
			List<Student> list=dp.read("src/com/briup/day06xml/student.xml");
			for(Student st:list){
				System.out.println(st);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	

}
