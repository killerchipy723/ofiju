
package Entidades;

import Accesos.Conexion;
import Accesos.Usuario;
import Vistas.FormPrincipal;
import Vistas.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


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
    
    public void login(String usu, String pas){
    String sql = "select * from usuario where usuario = ? and clave = ?";
    
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, usu);
        pst.setString(2, pas);
        ResultSet rs = pst.executeQuery();

        // Verificamos si hay un resultado
        if(rs.next()) {
            String uss = rs.getString("usuario");
            String pss = rs.getString("clave");

            if(uss.equals(usu) && pss.equals(pas)){
                JOptionPane.showMessageDialog(null,"Acceso Correcto al Sistema");
                Login login = new Login();
                FormPrincipal pri = new FormPrincipal();
                pri.setVisible(true);
                login.dispose();
               
                
             
                
            } else {
                JOptionPane.showMessageDialog(null,"Usuario o Contraseña Incorrectos", 
                                              "ERROR DE AUTENTICACIÓN", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Usuario o Contraseña Incorrectos", 
                                          "ERROR DE AUTENTICACIÓN", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"Error en la conexión a la base de datos", 
                                      "ERROR DE BASE DE DATOS", JOptionPane.ERROR_MESSAGE);
    }
}
// TABLA USUARIO
    public void tablaUsuario(JTable lista){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"ID","NOMBRE","APELLIDO","USUARIO","PRIVILEGIO"});
        String sql = "select * from usuario";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getString("ID_USUARIO"),
                    rs.getString("apellido"),
                    rs.getString("nombre"),
                    rs.getString("usuario"),
                    rs.getString("privilegio")
                });
                lista.setModel(modelo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
