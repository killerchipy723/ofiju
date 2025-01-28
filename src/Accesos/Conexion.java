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
               String driver = "org.mariadb.jdbc.Driver";
                String url = "jdbc:mariadb://localhost:3306/oficina-ofiju"; // URL de conexión con el servidor y base de datos
                String usr = "root"; // Usuario de la base de datos
                String pwd = "";  // Contraseña de la base de datos
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
