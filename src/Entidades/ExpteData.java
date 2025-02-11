
package Entidades;

import Accesos.Conexion;
import Accesos.Conexion;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ExpteData {
    Connection con = Conexion.Conectar();
    
    public void agregarExpte(JTextField expte,JComboBox ord,JTextField leg,JTextField ap,
            JComboBox estado,JTextArea caratula,JComboBox aud,JComboBox aten,JComboBox tec,
            JComboBox juez,JComboBox fis,JComboBox def,JComboBox asc,JComboBox estexpte,
            JTextArea obs,JComboBox pedido,JDateChooser fIngreso,JDateChooser fEgreso,
            JDateChooser fAud,JDateChooser hAud){
        
    }
}
