package org.eduami.javafaq.desginpattern.creational;

import java.io.FileInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

//Recognizable by creational methods returning the factory itself which in turn can be used to create another abstract/interface type)
public class AbstractFactory {
	public static void main(String[] args) throws Exception {
		
		// create a new DocumentBuilderFactory
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		// use the factory to create a documentbuilder
		DocumentBuilder builder = factory.newDocumentBuilder();

		// create a new document from input source
		FileInputStream fis = new FileInputStream("./src/main/java/org/eduami/javafaq/desginpattern/creational/Car.xml");
		InputSource is = new InputSource(fis);
		Document doc = builder.parse(is);

		// get the first element
		Element element = doc.getDocumentElement();

		// get all child nodes
		NodeList nodes = element.getChildNodes();

		// print the text content of each child
		for (int i = 0; i < nodes.getLength(); i++) {
			System.out.println("" + nodes.item(i).getTextContent());
		}

	}
}
