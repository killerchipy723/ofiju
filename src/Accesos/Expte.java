
package Accesos;

import java.sql.Date;
import java.sql.Time;

public class Expte {
    private int ID_EXP;
    private int NUMERO;
    private String CARATULA;
    private int LEGAJO;
    private int AP;
    private String ESTADO;
    private String OBSERVACIONES;
    private Date FECHA_INGRESO;
    private Date FECHA_EGRESO;
    private Date FECHA_AUDIENCIA;
    private Time HORA_AUDIENCIA;
    private String ULTIMO_TRAMITE;
    private int ID_ORGANISMO;
    private int ID_PERSONAL;

    public Expte() {
    }

    public Expte(int ID_EXP, int NUMERO, String CARATULA, int LEGAJO, int AP, String ESTADO, String OBSERVACIONES, Date FECHA_INGRESO, Date FECHA_EGRESO, Date FECHA_AUDIENCIA, Time HORA_AUDIENCIA, String ULTIMO_TRAMITE, int ID_ORGANISMO, int ID_PERSONAL) {
        this.ID_EXP = ID_EXP;
        this.NUMERO = NUMERO;
        this.CARATULA = CARATULA;
        this.LEGAJO = LEGAJO;
        this.AP = AP;
        this.ESTADO = ESTADO;
        this.OBSERVACIONES = OBSERVACIONES;
        this.FECHA_INGRESO = FECHA_INGRESO;
        this.FECHA_EGRESO = FECHA_EGRESO;
        this.FECHA_AUDIENCIA = FECHA_AUDIENCIA;
        this.HORA_AUDIENCIA = HORA_AUDIENCIA;
        this.ULTIMO_TRAMITE = ULTIMO_TRAMITE;
        this.ID_ORGANISMO = ID_ORGANISMO;
        this.ID_PERSONAL = ID_PERSONAL;
    }

    public int getID_EXP() {
        return ID_EXP;
    }

    public void setID_EXP(int ID_EXP) {
        this.ID_EXP = ID_EXP;
    }

    public int getNUMERO() {
        return NUMERO;
    }

    public void setNUMERO(int NUMERO) {
        this.NUMERO = NUMERO;
    }

    public String getCARATULA() {
        return CARATULA;
    }

    public void setCARATULA(String CARATULA) {
        this.CARATULA = CARATULA;
    }

    public int getLEGAJO() {
        return LEGAJO;
    }

    public void setLEGAJO(int LEGAJO) {
        this.LEGAJO = LEGAJO;
    }

    public int getAP() {
        return AP;
    }

    public void setAP(int AP) {
        this.AP = AP;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    public String getOBSERVACIONES() {
        return OBSERVACIONES;
    }

    public void setOBSERVACIONES(String OBSERVACIONES) {
        this.OBSERVACIONES = OBSERVACIONES;
    }

    public Date getFECHA_INGRESO() {
        return FECHA_INGRESO;
    }

    public void setFECHA_INGRESO(Date FECHA_INGRESO) {
        this.FECHA_INGRESO = FECHA_INGRESO;
    }

    public Date getFECHA_EGRESO() {
        return FECHA_EGRESO;
    }

    public void setFECHA_EGRESO(Date FECHA_EGRESO) {
        this.FECHA_EGRESO = FECHA_EGRESO;
    }

    public Date getFECHA_AUDIENCIA() {
        return FECHA_AUDIENCIA;
    }

    public void setFECHA_AUDIENCIA(Date FECHA_AUDIENCIA) {
        this.FECHA_AUDIENCIA = FECHA_AUDIENCIA;
    }

    public Time getHORA_AUDIENCIA() {
        return HORA_AUDIENCIA;
    }

    public void setHORA_AUDIENCIA(Time HORA_AUDIENCIA) {
        this.HORA_AUDIENCIA = HORA_AUDIENCIA;
    }

    public String getULTIMO_TRAMITE() {
        return ULTIMO_TRAMITE;
    }

    public void setULTIMO_TRAMITE(String ULTIMO_TRAMITE) {
        this.ULTIMO_TRAMITE = ULTIMO_TRAMITE;
    }

    public int getID_ORGANISMO() {
        return ID_ORGANISMO;
    }

    public void setID_ORGANISMO(int ID_ORGANISMO) {
        this.ID_ORGANISMO = ID_ORGANISMO;
    }

    public int getID_PERSONAL() {
        return ID_PERSONAL;
    }

    public void setID_PERSONAL(int ID_PERSONAL) {
        this.ID_PERSONAL = ID_PERSONAL;
    }

    @Override
    public String toString() {
        return "Expte{" + "ID_EXP=" + ID_EXP + ", NUMERO=" + NUMERO + ", CARATULA=" + CARATULA + ", LEGAJO=" + LEGAJO + ", AP=" + AP + ", ESTADO=" + ESTADO + ", OBSERVACIONES=" + OBSERVACIONES + ", FECHA_INGRESO=" + FECHA_INGRESO + ", FECHA_EGRESO=" + FECHA_EGRESO + ", FECHA_AUDIENCIA=" + FECHA_AUDIENCIA + ", HORA_AUDIENCIA=" + HORA_AUDIENCIA + ", ULTIMO_TRAMITE=" + ULTIMO_TRAMITE + ", ID_ORGANISMO=" + ID_ORGANISMO + ", ID_PERSONAL=" + ID_PERSONAL + '}';
    }
    
    
    
}
