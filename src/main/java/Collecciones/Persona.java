package Collecciones;

public class Persona {

    private Integer id;

    private String nombre;

    private String paterno;

    public Persona() {

    }

    public Persona(Integer id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = apellido;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getPaterno() {
        return paterno;
    }

    /**
     * @param paterno the apellido to set
     */
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + paterno + '\'' +
                '}';
    }
}
