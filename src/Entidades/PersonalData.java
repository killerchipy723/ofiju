
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


public class PersonalData {
    Connection con = Conexion.Conectar();
    
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
}
