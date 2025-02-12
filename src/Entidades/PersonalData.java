
package Entidades;

import Accesos.Conexion;
import Accesos.Personal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class PersonalData {
    Connection con = Conexion.Conectar();
    
    /// Agregar Personal
    
    public void agregarPersonal(JTextField ape,JTextField nom,JTextField cargo) throws SQLException{
        String sql = "Insert into personal(apellido,nombre,CARGO)VALUES(?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ape.getText());
            pst.setString(2,nom.getText());
            pst.setString(3,cargo.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro de Personal Exitoso","REGISTRO DE PERSONAL",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(PersonalData.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    // MODIFICAR PERSONAL
    public void modificarPersonal(int id, JTextField ape, JTextField nom, JTextField cargo) throws SQLException {
    // Consulta para actualizar el registro de personal
    String sql = "UPDATE personal SET apellido = ?, nombre = ?, cargo = ? WHERE id_personal = ?"; 
    
    try {
        // Preparamos la consulta
        PreparedStatement pst = con.prepareStatement(sql);
        
        // Establecemos los valores para la consulta
        pst.setString(1, ape.getText());  // Apellido
        pst.setString(2, nom.getText());  // Nombre
        pst.setString(3, cargo.getText()); // Cargo
        pst.setInt(4, id);  // ID del personal a modificar (este es el valor que se usa para identificar el registro)

        // Ejecutamos la consulta
        int rowsAffected = pst.executeUpdate();
        
        // Verificamos si se actualizó al menos un registro
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Registro de Personal Modificado Exitosamente", 
                                          "MODIFICACIÓN DE PERSONAL", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el registro de personal para modificar", 
                                          "ERROR DE MODIFICACIÓN", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        Logger.getLogger(PersonalData.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error al modificar el registro de personal", 
                                      "ERROR DE BASE DE DATOS", JOptionPane.ERROR_MESSAGE);
    } finally {
        // Cerrar la conexión
      
    }
}

    
    // TABLA PERSONAL
    
    public void tablaPersonal(JTable lista){
        String sql = "select * from personal";
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"ID","APELLIDO","NOMBRE","CARGO"});
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getString("id_personal"),
                    rs.getString("apellido"),
                    rs.getString("nombre"),
                    rs.getString("CARGO")
                });
                lista.setModel(modelo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonalData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void comboTecnico(JComboBox lista){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        String sql = "Select * from personal where cargo = 'TECNICO'";
        try {
            Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while(rs.next()){
           Personal personal = new Personal();
           personal.setApellido(rs.getString("apellido"));
           personal.setNombre(rs.getString("nombre"));
           personal.setCargo(rs.getString("cargo"));
           modelo.addElement(personal.getApellido()+", "+personal.getNombre());
           lista.setModel(modelo);
       }
          
        
        } catch (SQLException ex) {
            Logger.getLogger(PersonalData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // combo fiscal
    
      public void comboFiscal(JComboBox lista){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        String sql = "Select * from personal where cargo = 'FISCAL'";
        try {
            Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while(rs.next()){
           Personal personal = new Personal();
           personal.setApellido(rs.getString("apellido"));
           personal.setNombre(rs.getString("nombre"));
           personal.setCargo(rs.getString("cargo"));
           modelo.addElement(personal.getApellido()+", "+personal.getNombre());
           lista.setModel(modelo);
       }
          
        
        } catch (SQLException ex) {
            Logger.getLogger(PersonalData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
      // combo audiencista
      
       public void comboAudiencista(JComboBox lista){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        String sql = "Select * from personal where cargo = 'AUDIENCISTA'";
        try {
            Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while(rs.next()){
           Personal personal = new Personal();
           personal.setApellido(rs.getString("apellido"));
           personal.setNombre(rs.getString("nombre"));
           personal.setCargo(rs.getString("cargo"));
           modelo.addElement(personal.getApellido()+", "+personal.getNombre());
           lista.setModel(modelo);
       }
          
        
        } catch (SQLException ex) {
            Logger.getLogger(PersonalData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
        public void comboAtencion(JComboBox lista){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        String sql = "Select * from personal where cargo = 'ATENCION AL PUBLICO'";
        try {
            Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while(rs.next()){
           Personal personal = new Personal();
           personal.setApellido(rs.getString("apellido"));
           personal.setNombre(rs.getString("nombre"));
           personal.setCargo(rs.getString("cargo"));
           modelo.addElement(personal.getApellido()+", "+personal.getNombre());
           lista.setModel(modelo);
       }
          
        
        } catch (SQLException ex) {
            Logger.getLogger(PersonalData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        // COMBO JUEZ
        
         public void comboJuez(JComboBox lista){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        String sql = "Select * from personal where cargo = 'JUEZ'";
        try {
            Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while(rs.next()){
           Personal personal = new Personal();
           personal.setApellido(rs.getString("apellido"));
           personal.setNombre(rs.getString("nombre"));
           personal.setCargo(rs.getString("cargo"));
           modelo.addElement(personal.getApellido()+", "+personal.getNombre());
           lista.setModel(modelo);
       }
          
        
        } catch (SQLException ex) {
            Logger.getLogger(PersonalData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         
         public void comboDefensor(JComboBox lista){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        String sql = "Select * from personal where cargo = 'DEFENSOR'";
        try {
            Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while(rs.next()){
           Personal personal = new Personal();
           personal.setApellido(rs.getString("apellido"));
           personal.setNombre(rs.getString("nombre"));
           personal.setCargo(rs.getString("cargo"));
           modelo.addElement(personal.getApellido()+", "+personal.getNombre());
           lista.setModel(modelo);
       }
          
        
        } catch (SQLException ex) {
            Logger.getLogger(PersonalData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         
        
         
         public void comboSecretario(JComboBox lista){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        String sql = "Select * from personal where cargo = 'SECRETARIO'";
        try {
            Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while(rs.next()){
           Personal personal = new Personal();
           personal.setApellido(rs.getString("apellido"));
           personal.setNombre(rs.getString("nombre"));
           personal.setCargo(rs.getString("cargo"));
           modelo.addElement(personal.getApellido()+", "+personal.getNombre());
           lista.setModel(modelo);
       }
          
        
        } catch (SQLException ex) {
            Logger.getLogger(PersonalData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         
         //COMBO ABOGADO
         
         public void comboAbogado(JComboBox lista){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        String sql = "Select * from personal where cargo = 'ABOGADO'";
        try {
            Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(sql);
       while(rs.next()){
           Personal personal = new Personal();
           personal.setApellido(rs.getString("apellido"));
           personal.setNombre(rs.getString("nombre"));
           personal.setCargo(rs.getString("cargo"));
           modelo.addElement(personal.getApellido()+", "+personal.getNombre());
           lista.setModel(modelo);
       }
          
        
        } catch (SQLException ex) {
            Logger.getLogger(PersonalData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         
         
}
