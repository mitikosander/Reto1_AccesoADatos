package modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultasBBDD {
	// Escribir Empleado en BBDD (archivo xml)
	
	public void guadar_emp_BBDD(Empleado emp) throws SQLException {
		Metodos metodos=new Metodos();
		// Creamos la conexion a la base
		BBDD bbdd = new BBDD();
		Connection connection = bbdd.getInstance().conectar();
		// Preparamos una sentencia para hacer insert
		PreparedStatement ps = connection.prepareStatement("Insert into empleado VALUES (?,?,?,?,?,?)");

		// Asignamos los atributos del objeto al insert
		ps.setInt(1, emp.getCodigo());

		ps.setString(2, emp.getNombre());

		ps.setString(3, emp.getApellido());
		
		Date fecha= (Date) metodos.parseFecha(emp.getFecha_creacion());
		ps.setDate(4, fecha);

		ps.setInt(5, emp.getCod_dpto());

		ps.setInt(6, emp.getCod_jefe());

		// Ejecutamos la Query
		ps.executeUpdate();

		// Cerramos la conexion a la base
		bbdd.getInstance().desconectar();
	}

	// Escribir Departamento en BBDD (archivo txt)
	public void guadar_dpto_BBDD(Departamento dpto) throws SQLException {
		// Creamos la conexion a la base
		BBDD bbdd = new BBDD();
		Connection connection = bbdd.getInstance().conectar();
		// Preparamos una sentencia para hacer insert
		PreparedStatement ps = connection.prepareStatement("Insert into departamento VALUES (?,?,?)");
		// Asignamos los atributos del objeto al insert
		ps.setInt(1, dpto.getCodigo());

		ps.setString(2, dpto.getNombre());

		ps.setString(3, dpto.getLoc());
		// Ejecutamos la Query
		ps.executeUpdate();

		// Cerramos la conexion a la base

		bbdd.getInstance().desconectar();
	}
}
