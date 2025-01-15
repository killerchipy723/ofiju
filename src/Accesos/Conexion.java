package Accesos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static Connection con;

    public static Connection Conectar() {
        try {
            if (con == null || con.isClosed()) {
                // Controlador para MySQL o MariaDB
                String driver = "org.mariadb.jdbc.Driver"; // Funciona tanto para MySQL como para MariaDB
                // URL de conexión para MySQL/MariaDB (localhost por defecto)
                String url = "jdbc:mysql://localhost:3306/ofiju"; // Cambia "nombre_base_datos" por tu base de datos
                String usr = "root"; // Cambia por el nombre de usuario de phpMyAdmin
                String pwd = ""; // Cambia por la contraseña del usuario

                // Cargar el driver de MariaDB o MySQL
                Class.forName(driver);

                // Establecer la conexión
                con = DriverManager.getConnection(url, usr, pwd);
                System.out.println("Conectado a la base de datos MySQL/MariaDB a través de phpMyAdmin");
            }

            return con;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Error al crear la conexión: " + e.getMessage());
            throw new RuntimeException("Error al crear la conexión", e);
        }
    }
}
