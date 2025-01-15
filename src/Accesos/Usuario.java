
package Accesos;


public class Usuario {
  private int ID_USUARIO;
private String nombre;
private String apellido;
private String usuario;
private String clave;
private String privilegio;

    public Usuario() {
    }

    public Usuario(int ID_USUARIO, String nombre, String apellido, String usuario, String clave, String privilegio) {
        this.ID_USUARIO = ID_USUARIO;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.clave = clave;
        this.privilegio = privilegio;
    }

    public int getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(int ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }

    @Override
    public String toString() {
        return "Usuario{" + "ID_USUARIO=" + ID_USUARIO + ", nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario + ", clave=" + clave + ", privilegio=" + privilegio + '}';
    }


}
