package modelo;
import java.io.*;
import java.util.ArrayList;		
import java.util.Scanner;
public class LeerFichero {
<<<<<<< HEAD
	public static void main(String[] args) {
=======
	private static final ArrayList<?> listaDepartamentos = null;
	
>>>>>>> branch 'Sander' of https://github.com/mitikosander/Reto1_AccesoADatos.git

<<<<<<< HEAD
		// TODO Auto-generated method stub

		//escribirdepartamento();

		//leerdepartamento();
=======
	public ArrayList<?> leerdepartamento() {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
		archivo = new File ("C:\\Users\\admin1\\Desktop\\reto1-AccesoDatos(David)\\departamento.txt");
		ArrayList<Departamento> listaDepartamentos = new ArrayList<Departamento>();
		fr = new FileReader (archivo);
		br = new BufferedReader(fr);
		Scanner scanner;
		scanner=new Scanner(archivo);
		while(scanner.hasNextLine()) {
			String linea = scanner.nextLine();
			Scanner delimitar = new Scanner(linea);
			delimitar.useDelimiter("\\s*,\\s*");
			Departamento i = new Departamento();
			i.setCodigo(delimitar.nextInt());
			i.setNombre(delimitar.next());
			i.setLoc(delimitar.next());
			listaDepartamentos.add(i);
		} 	
		//hola
		scanner.close();
		System.out.println(listaDepartamentos);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return listaDepartamentos;
>>>>>>> branch 'Sander' of https://github.com/mitikosander/Reto1_AccesoADatos.git
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
           	//2

 

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
    
	

