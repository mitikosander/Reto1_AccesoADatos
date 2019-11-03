package modelo;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;		
import java.util.Scanner;
public class LeerFichero {
	private static final ArrayList<?> listaDepartamentos = null;
	

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
	}
	
	
	}

