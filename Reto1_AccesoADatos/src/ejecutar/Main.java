package ejecutar;
import java.sql.Connection; //TODO borrar despues de probar la conexion

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modelo modelo = new Modelo();
		Vista vista = new Vista();
		Controlador controlador = new Controlador(vista, modelo);
		modelo.getBbdd().conectar();
		//modelo.getFichero().leerxml();
		//modelo.getFichero().escribirxml();
		modelo.getLeerFichero().leerdepartamento();
		modelo.getBbdd().desconectar();
	}

}
