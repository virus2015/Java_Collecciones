package Collecciones;

public class Clientes_ac2 {


    private String folio;
    private String nombre;
    private String paterno;
    private String materno;
    private String curp;

    public Clientes_ac2() {
    }



    public Clientes_ac2(String folio, String nombre, String paterno, String materno, String curp) {
        this.folio = folio;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.curp = curp;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Override
    public String toString() {
        return "Clientes_ac2{" + "folio=" + folio + ", nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ", curp=" + curp + '}';
    }



}
