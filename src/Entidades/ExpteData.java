
package Entidades;

import Accesos.Conexion;
import Accesos.Conexion;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
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

        
        pst.setString(1, (expte.getText().isEmpty()) ? null : expte.getText());  // Número de expediente
pst.setString(2, (org.getSelectedItem() == null) ? null : org.getSelectedItem().toString()); // ID de organismo
pst.setString(3, (leg.getText().isEmpty()) ? null : leg.getText());  // Legajo
pst.setString(4, (ap.getText().isEmpty()) ? null : ap.getText());  // Apellido
pst.setString(5, (estado.getSelectedItem() == null) ? null : estado.getSelectedItem().toString()); // Estado
pst.setString(6, (caratula.getText().isEmpty()) ? null : caratula.getText());  // Carátula
pst.setString(7, (aud.getSelectedItem() == null) ? null : aud.getSelectedItem().toString());
pst.setString(8, (aten.getSelectedItem() == null) ? null : aten.getSelectedItem().toString());
pst.setString(9, (tec.getSelectedItem() == null) ? null : tec.getSelectedItem().toString());
pst.setString(10, (sec.getSelectedItem() == null) ? null : sec.getSelectedItem().toString());
pst.setString(11, (juez.getSelectedItem() == null) ? null : juez.getSelectedItem().toString());
pst.setString(12, (fis.getSelectedItem() == null) ? null : fis.getSelectedItem().toString());
pst.setString(13, (def.getSelectedItem() == null) ? null : def.getSelectedItem().toString());
pst.setString(14, (asc.getSelectedItem() == null) ? null : asc.getSelectedItem().toString());
pst.setString(15, (abo.getSelectedItem() == null) ? null : abo.getSelectedItem().toString());
pst.setString(16, (pedido.getSelectedItem() == null) ? null : pedido.getSelectedItem().toString());

// Fecha de audiencia, asegurarse de que no sea null
pst.setDate(17, (fAud.getDate() == null) ? null : new java.sql.Date(fAud.getDate().getTime()));
pst.setString(18, (hAud.getSelectedItem() == null) ? null : hAud.getSelectedItem().toString());

// Fechas de ingreso y egreso, asegurarse de que no sean null
pst.setDate(19, (fIngreso.getDate() == null) ? null : new java.sql.Date(fIngreso.getDate().getTime()));
pst.setDate(20, (fEgreso.getDate() == null) ? null : new java.sql.Date(fEgreso.getDate().getTime()));

pst.setString(21, (utramite.getSelectedItem() == null) ? null : utramite.getSelectedItem().toString()); // Utramite
pst.setString(22, (obs.getText().isEmpty()) ? null : obs.getText());  // Observaciones


        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"El Expediente se Registró Correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);

    } catch (SQLException ex) {
        Logger.getLogger(ExpteData.class.getName()).log(Level.SEVERE, null, ex);
    }
}
/// BUSCAR EXPEDIENTE:
    
    public void buscarExpte(
        String numeroExpte,
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

    String sql = "SELECT * FROM expedientes WHERE numero = ?";

    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, numeroExpte);  // Seteamos el número de expediente

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            // Setear los valores de los campos con los resultados de la consulta
            expte.setText(rs.getString("numero")); // Número de expediente
            org.setSelectedItem(rs.getString("organismo")); // Organismo
            leg.setText(rs.getString("legajo")); // Legajo
            ap.setText(rs.getString("ap")); // Apellido
            estado.setSelectedItem(rs.getString("estado")); // Estado
            caratula.setText(rs.getString("caratula")); // Carátula
            aud.setSelectedItem(rs.getString("aud")); // Audiencia
            aten.setSelectedItem(rs.getString("apublico")); // Atendido por
            tec.setSelectedItem(rs.getString("tecnico")); // Técnico
            sec.setSelectedItem(rs.getString("secretario")); // Secretario
            juez.setSelectedItem(rs.getString("juez")); // Juez
            fis.setSelectedItem(rs.getString("fiscal")); // Fiscal
            def.setSelectedItem(rs.getString("defensor")); // Defensor
            asc.setSelectedItem(rs.getString("asesor")); // Asesor
            abo.setSelectedItem(rs.getString("abo")); // Abogado
            utramite.setSelectedItem(rs.getString("utramite")); // Utramite
            obs.setText(rs.getString("observaciones")); // Observaciones
            pedido.setSelectedItem(rs.getString("pedido")); // Pedido

            // Fechas (Verifica que la fecha sea válida antes de setearla)
            fAud.setDate(rs.getDate("faud")); // Fecha de audiencia
            hAud.setSelectedItem(rs.getString("haud")); // Hora de audiencia
            fIngreso.setDate(rs.getDate("fingreso")); // Fecha de ingreso
            fEgreso.setDate(rs.getDate("fegreso")); // Fecha de egreso
        } else {
            JOptionPane.showMessageDialog(null, "Expediente no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException ex) {
        Logger.getLogger(ExpteData.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error al buscar el expediente", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    /// MODIFICAR EXPEDIENTES
    
    public void modificarExpte(
        String numeroExpte, // Número de expediente para identificar cuál modificar
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
    String sql = "UPDATE expedientes SET "
            + "numero = ?, organismo = ?, legajo = ?, ap = ?, estado = ?, caratula = ?, aud = ?, apublico = ?, "
            + "tecnico = ?, secretario = ?, juez = ?, fiscal = ?, defensor = ?, asesor = ?, abo = ?, pedido = ?, "
            + "faud = ?, haud = ?, fingreso = ?, fegreso = ?, utramite = ?, observaciones = ? WHERE numero = ?";

    try {
        PreparedStatement pst = con.prepareStatement(sql);

        // Setear los valores de los campos a modificar
        pst.setString(1, (expte.getText().isEmpty()) ? null : expte.getText());  // Número de expediente
        pst.setString(2, (org.getSelectedItem() == null) ? null : org.getSelectedItem().toString()); // Organismo
        pst.setString(3, (leg.getText().isEmpty()) ? null : leg.getText());  // Legajo
        pst.setString(4, (ap.getText().isEmpty()) ? null : ap.getText());  // Apellido
        pst.setString(5, (estado.getSelectedItem() == null) ? null : estado.getSelectedItem().toString()); // Estado
        pst.setString(6, (caratula.getText().isEmpty()) ? null : caratula.getText());  // Carátula
        pst.setString(7, (aud.getSelectedItem() == null) ? null : aud.getSelectedItem().toString()); // Audiencia
        pst.setString(8, (aten.getSelectedItem() == null) ? null : aten.getSelectedItem().toString()); // Atendido por
        pst.setString(9, (tec.getSelectedItem() == null) ? null : tec.getSelectedItem().toString()); // Técnico
        pst.setString(10, (sec.getSelectedItem() == null) ? null : sec.getSelectedItem().toString()); // Secretario
        pst.setString(11, (juez.getSelectedItem() == null) ? null : juez.getSelectedItem().toString()); // Juez
        pst.setString(12, (fis.getSelectedItem() == null) ? null : fis.getSelectedItem().toString()); // Fiscal
        pst.setString(13, (def.getSelectedItem() == null) ? null : def.getSelectedItem().toString()); // Defensor
        pst.setString(14, (asc.getSelectedItem() == null) ? null : asc.getSelectedItem().toString()); // Asesor
        pst.setString(15, (abo.getSelectedItem() == null) ? null : abo.getSelectedItem().toString()); // Abogado
        pst.setString(16, (pedido.getSelectedItem() == null) ? null : pedido.getSelectedItem().toString()); // Pedido

        // Fechas (asegurarse de que no sean null)
        pst.setDate(17, (fAud.getDate() == null) ? null : new java.sql.Date(fAud.getDate().getTime())); // Fecha de audiencia
        pst.setString(18, (hAud.getSelectedItem() == null) ? null : hAud.getSelectedItem().toString()); // Hora de audiencia
        pst.setDate(19, (fIngreso.getDate() == null) ? null : new java.sql.Date(fIngreso.getDate().getTime())); // Fecha de ingreso
        pst.setDate(20, (fEgreso.getDate() == null) ? null : new java.sql.Date(fEgreso.getDate().getTime())); // Fecha de egreso

        pst.setString(21, (utramite.getSelectedItem() == null) ? null : utramite.getSelectedItem().toString()); // Utramite
        pst.setString(22, (obs.getText().isEmpty()) ? null : obs.getText());  // Observaciones

        // Número de expediente para identificar el registro a actualizar
        pst.setString(23, numeroExpte);  // Este es el expediente que estamos modificando

        // Ejecutar la actualización
        int filasAfectadas = pst.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "El expediente fue modificado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el expediente para modificar", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException ex) {
        Logger.getLogger(ExpteData.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error al modificar el expediente", "Error", JOptionPane.ERROR_MESSAGE);
    }
}


}
