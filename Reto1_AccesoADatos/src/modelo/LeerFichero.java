package modelo;
import java.io.*;
import java.util.ArrayList;


public class LeerFichero {

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
           		
        	    bw.write(Integer.toString(x.getCodigo()));
           		
           		bw.write(x.getLoc());
           		
           		bw.write( x.getNombre());
           		
           	//Error al intentar escribir en el txt 
           	//2
           		bw.close();

 

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

 

    public ArrayList<Departamento> leerdepartamento(){
    	
    	Departamento depart=new Departamento();
    	ArrayList<Departamento> departamentos =new ArrayList<Departamento>();
    	

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

/*			String linea;

			while((linea=br.readLine())!=null)

				System.out.println(linea);
*/
			//Hay que hacer que el archivo guarde los datos en un objeto departamento no mostrar por consola
			
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
        
        return departamentos;

    }

}
    
	

