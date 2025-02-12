
package Accesos;

import java.sql.Date;


public class Expte {
    private int id_expte;
    private String numero;
    private int id_organismo;
    private String legajo;
    private String ap;
    private String estado;
    private String caratula;
    private String aud;
    private String apublico;
    private String tecnico;
    private String secretario;
    private String juez;
    private String fiscal;
    private String defensor;
    private String abo;
    private Date faud;
    private String haud;
    private Date fingreso;
    private Date fegreso;
    private String utramite;
    private String pedido;
    private String observaciones;
    private int id_personal;

    public Expte() {
    }

    public Expte(int id_expte, String numero, int id_organismo, String legajo, String ap, String estado, String caratula, String aud, String apublico, String tecnico, String secretario, String juez, String fiscal, String defensor, String abo, Date faud, String haud, Date fingreso, Date fegreso, String utramite, String pedido, String observaciones, int id_personal) {
        this.id_expte = id_expte;
        this.numero = numero;
        this.id_organismo = id_organismo;
        this.legajo = legajo;
        this.ap = ap;
        this.estado = estado;
        this.caratula = caratula;
        this.aud = aud;
        this.apublico = apublico;
        this.tecnico = tecnico;
        this.secretario = secretario;
        this.juez = juez;
        this.fiscal = fiscal;
        this.defensor = defensor;
        this.abo = abo;
        this.faud = faud;
        this.haud = haud;
        this.fingreso = fingreso;
        this.fegreso = fegreso;
        this.utramite = utramite;
        this.pedido = pedido;
        this.observaciones = observaciones;
        this.id_personal = id_personal;
    }

    public int getId_expte() {
        return id_expte;
    }

    public void setId_expte(int id_expte) {
        this.id_expte = id_expte;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getId_organismo() {
        return id_organismo;
    }

    public void setId_organismo(int id_organismo) {
        this.id_organismo = id_organismo;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCaratula() {
        return caratula;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    public String getAud() {
        return aud;
    }

    public void setAud(String aud) {
        this.aud = aud;
    }

    public String getApublico() {
        return apublico;
    }

    public void setApublico(String apublico) {
        this.apublico = apublico;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getSecretario() {
        return secretario;
    }

    public void setSecretario(String secretario) {
        this.secretario = secretario;
    }

    public String getJuez() {
        return juez;
    }

    public void setJuez(String juez) {
        this.juez = juez;
    }

    public String getFiscal() {
        return fiscal;
    }

    public void setFiscal(String fiscal) {
        this.fiscal = fiscal;
    }

    public String getDefensor() {
        return defensor;
    }

    public void setDefensor(String defensor) {
        this.defensor = defensor;
    }

    public String getAbo() {
        return abo;
    }

    public void setAbo(String abo) {
        this.abo = abo;
    }

    public Date getFaud() {
        return faud;
    }

    public void setFaud(Date faud) {
        this.faud = faud;
    }

    public String getHaud() {
        return haud;
    }

    public void setHaud(String haud) {
        this.haud = haud;
    }

    public Date getFingreso() {
        return fingreso;
    }

    public void setFingreso(Date fingreso) {
        this.fingreso = fingreso;
    }

    public Date getFegreso() {
        return fegreso;
    }

    public void setFegreso(Date fegreso) {
        this.fegreso = fegreso;
    }

    public String getUtramite() {
        return utramite;
    }

    public void setUtramite(String utramite) {
        this.utramite = utramite;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getId_personal() {
        return id_personal;
    }

    public void setId_personal(int id_personal) {
        this.id_personal = id_personal;
    }

    @Override
    public String toString() {
        return "Expte{" + "id_expte=" + id_expte + ", numero=" + numero + ", id_organismo=" + id_organismo + ", legajo=" + legajo + ", ap=" + ap + ", estado=" + estado + ", caratula=" + caratula + ", aud=" + aud + ", apublico=" + apublico + ", tecnico=" + tecnico + ", secretario=" + secretario + ", juez=" + juez + ", fiscal=" + fiscal + ", defensor=" + defensor + ", abo=" + abo + ", faud=" + faud + ", haud=" + haud + ", fingreso=" + fingreso + ", fegreso=" + fegreso + ", utramite=" + utramite + ", pedido=" + pedido + ", observaciones=" + observaciones + ", id_personal=" + id_personal + '}';
    }
    
    
    
    
}
