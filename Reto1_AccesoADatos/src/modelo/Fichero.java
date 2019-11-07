package modelo;

import java.io.File;
import java.util.ArrayList;


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
	
	
	private Metodos metodos= new Metodos();
	private static Node doc;
	Empleado datos = new Empleado();
	String fecha_form;
	
	
	public ArrayList<Empleado> leerEmpleado() {
		File file = new File("empleados.xml");
		ArrayList<Empleado> empleados=new ArrayList<Empleado>();
		try {
			  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			   doc = (Node) dBuilder.parse(file);
			  
			// almacenamos los nodos para luego mostrar la
			// cantidad de ellos con el método getLength()
			NodeList nList = ((org.w3c.dom.Document) doc).getElementsByTagName("empleado");
			System.out.println("Número de Empleados: " + nList.getLength());
			
			
			} catch(Exception e) {
			  e.printStackTrace();
			}
		
		
		NodeList nList = ((org.w3c.dom.Document) doc).getElementsByTagName("empleado");

		for(int temp = 0; temp < nList.getLength(); temp++) {
			  Node nNode = nList.item(temp);
			  
			  if(nNode.getNodeType() == Node.ELEMENT_NODE) {
			    Element eElement = (Element) nNode;

			    datos.setCodigo(Integer.parseInt(eElement.getAttribute("id")));
			   
			    datos.setNombre(eElement.getElementsByTagName("nombre").item(0).getTextContent()); 
			  
			    datos.setApellido(eElement.getElementsByTagName("apellido").item(0).getTextContent());
			    
			    String fecha= eElement.getElementsByTagName("fecha_creacion").item(0).getTextContent();
			    datos.setFecha_creacion(fecha_form=metodos.formatFecha(fecha));
			
			    datos.setCod_dpto(Integer.parseInt(eElement.getElementsByTagName("cod_dpto").item(0).getTextContent()));
			                
			   datos.setCod_jefe(Integer.parseInt(eElement.getElementsByTagName("cod_jefe").item(0).getTextContent())) ;
			   
			   empleados.add(datos);
			  }
			}

		return empleados;
	}
	
	
	//FIXME EJEMPLO
	public void escribirEmpleado() {
		try {
			  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			  DocumentBuilder db = dbf.newDocumentBuilder();
			   doc =  db.newDocument();

			  // definimos el elemento raíz del documento
			  Element eRaiz = ((org.w3c.dom.Document) doc).createElement("empleados");
			  ((Node) doc).appendChild(eRaiz);

			  // definimos el nodo que contendrá los elementos
			  Element eEmpleado = ((org.w3c.dom.Document) doc).createElement("empleado");
			  eRaiz.appendChild(eEmpleado);

			  // atributo para el nodo coche
			  Attr attr = ((org.w3c.dom.Document) doc).createAttribute("id");
			  attr.setValue("1");
			  eEmpleado.setAttributeNode(attr);

			  // definimos cada uno de los elementos y le asignamos un valor
			  Element eNombre = ((org.w3c.dom.Document) doc).createElement("nombre");
			  eNombre.appendChild(((org.w3c.dom.Document) doc).createTextNode("Egoitz"));
			  eEmpleado.appendChild(eNombre);

			  Element eApellido = ((org.w3c.dom.Document) doc).createElement("apellido");
			  eApellido.appendChild(((org.w3c.dom.Document) doc).createTextNode("Gallaga"));
			  eEmpleado.appendChild(eApellido);

			  Element eFecha = ((org.w3c.dom.Document) doc).createElement("fecha_creacion");
			  eFecha.appendChild(((org.w3c.dom.Document) doc).createTextNode("22/10/2019"));
			  eEmpleado.appendChild(eFecha);
			  
			  Element eCod_Dpto = ((org.w3c.dom.Document) doc).createElement("cod_dpto");
			  eCod_Dpto.appendChild(((org.w3c.dom.Document) doc).createTextNode("5"));
			  eEmpleado.appendChild(eCod_Dpto);
			  
			  Element eCod_Jefe = ((org.w3c.dom.Document) doc).createElement("cod_jefe");
			  eCod_Jefe.appendChild(((org.w3c.dom.Document) doc).createTextNode("0"));
			  eEmpleado.appendChild(eCod_Jefe);

			  // clases necesarias finalizar la creación del archivo XML
			  TransformerFactory transformerFactory = TransformerFactory.newInstance();
			  Transformer transformer = transformerFactory.newTransformer();
			  DOMSource source = new DOMSource((Node) doc);
			  StreamResult result = new StreamResult(new File("empleados.xml"));

			  transformer.transform(source, result);
			} catch(Exception e) {
			  e.printStackTrace();
			}
		
	}
}
