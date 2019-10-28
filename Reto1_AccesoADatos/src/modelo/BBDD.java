package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class BBDD {
    private static BBDD ourInstance = new BBDD();

    private static final String DATABASE_DRIVER = "org.mariadb.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/reto1";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    private Connection conectar;
    private Properties propiedad;

    // Singleton
    public static BBDD getInstance() {
        return ourInstance;
    }

   

    private Properties getProperties() {
        if(propiedad == null) {
            propiedad = new Properties();
            propiedad.setProperty("user", USERNAME);
            propiedad.setProperty("password", PASSWORD);
        }
        return propiedad;
    }

    public Connection conectar() {
        if (conectar == null) {
            try {
                Class.forName(DATABASE_DRIVER);
                conectar = DriverManager.getConnection(DATABASE_URL, getProperties());
                System.out.println("Conexion exitosa");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return conectar;
    }

    public void desconectar() {
        if(conectar != null) {
            try {
                conectar.close();
                conectar = null;
                System.out.println("Desconexion exitosa");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
