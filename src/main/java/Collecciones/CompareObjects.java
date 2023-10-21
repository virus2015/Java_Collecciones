package Collecciones;

public class CompareObjects {

    public static void main(String args[]){

        String nombre = "jorge";
        String nombre_02 = new String(nombre);

        System.out.println(nombre+ " == " + nombre_02 + " -> " + (nombre == nombre_02));
        System.out.println(nombre+ " equals " + nombre_02 + " -> " + (nombre.equals(nombre_02)));

        String nombre_03 = nombre;

        System.out.println(nombre+ " == " + nombre_03 + " -> " + (nombre == nombre_03));
    }

}
