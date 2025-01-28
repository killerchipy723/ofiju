
package Accesos;


public class Personal {
    private int id_personal;
    private String apellido;
    private String nombre;
    private String cargo;

    public Personal() {
    }

    public Personal(int id_personal, String apellido, String nombre, String cargo) {
        this.id_personal = id_personal;
        this.apellido = apellido;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public int getId_personal() {
        return id_personal;
    }

    public void setId_personal(int id_personal) {
        this.id_personal = id_personal;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Personal{" + "id_personal=" + id_personal + ", apellido=" + apellido + ", nombre=" + nombre + ", cargo=" + cargo + '}';
    }
    
    
    
}
