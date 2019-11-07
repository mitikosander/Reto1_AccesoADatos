package ejecutar;

import java.sql.SQLException;
import java.util.ArrayList;

import controlador.Controlador;
import modelo.Empleado;
import modelo.Modelo;
import vista.Vista;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modelo modelo = new Modelo();
		Vista vista = new Vista();
		Controlador controlador = new Controlador(vista, modelo);

		modelo.getFichero().escribirEmpleado();
		ArrayList<Empleado> empleados = modelo.getFichero().leerEmpleado();
		Empleado a1;
		for (int i = 0; i < empleados.size(); i++) {
			try {
				a1=empleados.get(i);
				modelo.getConsultas().guadar_emp_BBDD(a1);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		modelo.getLeerFichero().leerdepartamento();
	}

}
