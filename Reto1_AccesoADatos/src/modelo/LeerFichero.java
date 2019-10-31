package modelo;
import java.io.*;
import java.util.ArrayList;		
import java.util.Scanner;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
public class LeerFichero {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		//escribirdepartamento();

		//leerdepartamento();
	}


    public  void escribirdepartamento() {

        FileWriter fichero = null;

        BufferedWriter bw = null;
        Departamento x = new Departamento();

        try

        {

        	fichero = new FileWriter("departamento.txt");

           	bw = new BufferedWriter(fichero);

 

           	System.out.println("Escribiendo en el archivo.txt");

           	for (int i = 0; i < 10; i++)	

        	    bw.write(Integer.parseInt(x.setCodigo("3")),x.setLoc("Elorrieta"),x.setNombre("Informatica"));
           	//Error al intentar escribir en el txt 

 

        } catch (Exception e) {

        	e.printStackTrace();

        } finally {

    	try {

 			// Nuevamente aprovechamos el finally para 

        		// asegurarnos que se cierra el fichero.

        		if (null != fichero)

        			fichero.close();

        	} catch (Exception e2) {

        		e2.printStackTrace();

        	}

        }

    }

 

    public  void leerdepartamento()

    {

        File archivo = null;

        FileReader fr = null;

        BufferedReader br = null;

 

        try {

			// Apertura del fichero y creacion de BufferedReader para poder

			// hacer una lectura comoda (disponer del metodo readLine()).

			archivo = new File ("departamento.txt");

			fr = new FileReader (archivo);

			br = new BufferedReader(fr);

 

			// Lectura del fichero

			System.out.println("Leyendo el contendio del archivo.txt");

			String linea;

			while((linea=br.readLine())!=null)

				System.out.println(linea);

        }

        catch(Exception e){

           e.printStackTrace();

        }finally{

           // En el finally cerramos el fichero, para asegurarnos

           // que se cierra tanto si todo va bien como si salta 

           // una excepcion.

           try{

              if( null != fr ){

                 fr.close();

              }

           }catch (Exception e2){

              e2.printStackTrace();

           }

        }

    }

}
    
	

