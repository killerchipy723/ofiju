



public class Personal {
    private int id_Personal;
    private String apellido;
    private String nombre;
    private String cargo;

    public Personal() {
    }

    public Personal(int id_Personal, String apellido, String nombre, String cargo) {
        this.id_Personal = id_Personal;
        this.apellido = apellido;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public int getId_Personal() {
        return id_Personal;
    }

    public void setId_Personal(int id_Personal) {
        this.id_Personal = id_Personal;
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
        return "Personal{" + "id_Personal=" + id_Personal + ", apellido=" + apellido + ", nombre=" + nombre + ", cargo=" + cargo + '}';
    }
    
    
    
}
