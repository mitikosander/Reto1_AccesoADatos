package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BBDD {
	private String url;
	private String bbdd;
	private static BBDD BaseSingleton;
	private Connection conexion;
	public static BBDD getConfigurador(String url, String bbdd) {
		if (BaseSingleton == null) {
			BaseSingleton = new BBDD(url, bbdd);
		}
		return BaseSingleton;
	}

	// metodo conectarse a base

	public Connection conectarBBDD(String url, String bbdd) {
		try {
			try {
				// Comprobamos si el driver esta disponible
				Class.forName("org.mariadb.jdbc.Driver");
			} catch (ClassNotFoundException ex) {
				System.out.println("Error al registrar el driver de mysql. Posibles causas: " + ex);
			}
			// Si el controlador esta bien procedemos a conectarnos
			 conexion = DriverManager
					.getConnection("jdbc:mariadb://" + url + ":3306/" + bbdd + "?user=root");
			
			System.out.println("Conexión Exitosa");
			
			return conexion;
		} catch (java.sql.SQLException sqle) {
			System.out.println("Conexion fallida: " + sqle);
			
			return null;
		}
	}

	// metodo para desconectarse de la base
	public void desconectarBBDD() {
		if (conexion != null) {
		    try {
		        conexion.close();
		        conexion=null;
		    } catch (SQLException e) {
		    	e.printStackTrace();
		    }
		}
	}

	BBDD(String url, String bbdd) {
		this.url = url;
		this.bbdd = bbdd;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBaseDatos() {
		return bbdd;
	}

	public void setBaseDatos(String bbdd) {
		this.bbdd = bbdd;

	}

}
