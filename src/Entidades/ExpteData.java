
package Entidades;

import Accesos.Conexion;
import Accesos.Conexion;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ExpteData {
    Connection con = Conexion.Conectar();
    
    public void agregarExpte(
        JTextField expte,
        JComboBox org,
        JTextField leg,
        JTextField ap,
        JComboBox estado,
        JTextArea caratula,
        JComboBox aud,
        JComboBox aten,
        JComboBox tec,
        JComboBox sec,
        JComboBox juez,
        JComboBox fis,
        JComboBox def,
        JComboBox asc,
        JComboBox abo,
        JComboBox utramite,
        JTextArea obs,
        JComboBox pedido,
        JDateChooser fAud,
        JComboBox hAud,
        JDateChooser fIngreso,
        JDateChooser fEgreso
        ) {

    String sql = "INSERT INTO expedientes(numero, organismo, legajo, ap, estado, caratula, aud, apublico, "
            + "tecnico, secretario, juez, fiscal, defensor, asesor,abo, pedido, faud, haud, fingreso, fegreso, utramite, "
            + "observaciones) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    try {
       
        PreparedStatement pst = con.prepareStatement(sql);

        
        pst.setString(1, expte.getText()); // Número de expediente
        pst.setString(2, org.getSelectedItem().toString()); // ID de organismo (ejemplo con índice)
        pst.setString(3, leg.getText()); // Legajo
        pst.setString(4, ap.getText()); // Apellido
        pst.setString(5, estado.getSelectedItem().toString()); // Estado
        pst.setString(6, caratula.getText()); // Carátula
        pst.setString(7, aud.getSelectedItem().toString());
        pst.setString(8, aten.getSelectedItem().toString());
        pst.setString(9, tec.getSelectedItem().toString());
        pst.setString(10, sec.getSelectedItem().toString());
        pst.setString(11, juez.getSelectedItem().toString());
        pst.setString(12, fis.getSelectedItem().toString());
        pst.setString(13, def.getSelectedItem().toString());
        pst.setString(14, asc.getSelectedItem().toString());
        pst.setString(15, abo.getSelectedItem().toString());
        pst.setString(16, pedido.getSelectedItem().toString());

       
        pst.setDate(17, new java.sql.Date(fAud.getDate().getTime())); // Fecha de audiencia
       pst.setString(18,hAud.getSelectedItem().toString());
        pst.setDate(19, new java.sql.Date(fIngreso.getDate().getTime())); // Fecha de ingreso
        pst.setDate(20, new java.sql.Date(fEgreso.getDate().getTime())); // Fecha de egreso

      
        pst.setString(21, utramite.getSelectedItem().toString()); // Utramite

       
        pst.setString(22, obs.getText());

        
        pst.executeUpdate();

    } catch (SQLException ex) {
        Logger.getLogger(ExpteData.class.getName()).log(Level.SEVERE, null, ex);
    }
}

}
