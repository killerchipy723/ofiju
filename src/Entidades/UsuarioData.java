
package Entidades;

import Accesos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class UsuarioData {
    Connection con = Conexion.Conectar();
    
    public void agregarUsuario(JTextField nom,JTextField ape,JTextField usu,JPasswordField clave,JComboBox priv){
        String sql = "Insert into usuario (nombre,apellido,usuario,clave,privilegio)VALUES(?,?,?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,nom.getText());
            pst.setString(2, ape.getText());
             pst.setString(3, usu.getText());
             pst.setString(4, clave.getText());
              pst.setString(5, priv.getSelectedItem().toString());
              
              pst.executeUpdate();
              JOptionPane.showMessageDialog(null,"Usuario Registrado Exitosamente!!","EXITO !",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos: "+ex);
        }
        
    }
}
