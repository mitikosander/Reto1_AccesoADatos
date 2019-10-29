package modelo;

import java.io.File;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class Fichero {

	private static Document doc;
	
	public void leerxml() {
		File file = new File("coches.xml");
		
		try {
			  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			   doc = (Document) dBuilder.parse(file);
			  
			// almacenamos los nodos para luego mostrar la
			// cantidad de ellos con el método getLength()
			NodeList nList = ((org.w3c.dom.Document) doc).getElementsByTagName("coche");
			System.out.println("Número de coches: " + nList.getLength());
			
			
			} catch(Exception e) {
			  e.printStackTrace();
			}
		
		
		NodeList nList = ((Element) doc).getElementsByTagName("coche");

		for (int i = 0; i < nList.getLength(); i++) {
		  Node node = nList.item(i);

		  if (node.getNodeType() == Node.ELEMENT_NODE) {
		    Element eElement = (Element) node;

		    if(eElement.hasChildNodes()) {
		      NodeList nl = node.getChildNodes();
		      for(int j=0; j<nl.getLength(); j++) {
		        Node nd = nl.item(j);
		        System.out.println(nd.getTextContent());
		      }
		    	}
		    }
		}
	}
	
	
	//FIXME EJEMPLO
	public void escribirxml() {
		try {
			  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			  DocumentBuilder db = dbf.newDocumentBuilder();
			   doc = (Document) db.newDocument();

			  // definimos el elemento raíz del documento
			  Element eRaiz = ((org.w3c.dom.Document) doc).createElement("concesionario");
			  ((Node) doc).appendChild(eRaiz);

			  // definimos el nodo que contendrá los elementos
			  Element eCoche = ((org.w3c.dom.Document) doc).createElement("coche");
			  eRaiz.appendChild(eCoche);

			  // atributo para el nodo coche
			  Attr attr = ((org.w3c.dom.Document) doc).createAttribute("id");
			  attr.setValue("1");
			  eCoche.setAttributeNode(attr);

			  // definimos cada uno de los elementos y le asignamos un valor
			  Element eMarca = ((org.w3c.dom.Document) doc).createElement("marca");
			  eMarca.appendChild(((org.w3c.dom.Document) doc).createTextNode("Renault"));
			  eCoche.appendChild(eMarca);

			  Element eModelo = ((org.w3c.dom.Document) doc).createElement("modelo");
			  eModelo.appendChild(((org.w3c.dom.Document) doc).createTextNode("Megano"));
			  eCoche.appendChild(eModelo);

			  Element eCilindrada = ((org.w3c.dom.Document) doc).createElement("cilindrada");
			  eCilindrada.appendChild(((org.w3c.dom.Document) doc).createTextNode("1.5"));
			  eCoche.appendChild(eCilindrada);

			  // clases necesarias finalizar la creación del archivo XML
			  TransformerFactory transformerFactory = TransformerFactory.newInstance();
			  Transformer transformer = transformerFactory.newTransformer();
			  DOMSource source = new DOMSource((Node) doc);
			  StreamResult result = new StreamResult(new File("ejercicio3.xml"));

			  transformer.transform(source, result);
			} catch(Exception e) {
			  e.printStackTrace();
			}
		
	}
}
