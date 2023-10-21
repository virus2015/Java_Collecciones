package Collecciones.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods1 {

    public static void main(String[] args) {
        String[] colores = {"rojo","rojo","blanco", "amarillo", "azul"};
        List<String> list1 = Arrays.asList(colores);

        System.out.println("La lista es : "+list1);
        for (String s : list1) {
            System.out.println("Lista 01 " + s);
        }

        List<String> list2 = new ArrayList<>();
        list2.add("negro");
        list2.add("blanco");
        list2.add("verde");

        Collections.addAll(list2, colores); //Agrega los objetos String de colores a list1
        for (String s : list2) {
            System.out.println(" vvvv: " + s);
        }
        //Obtiene la frecuencia de rojo
        int frecuencia = Collections.frequency(list1, "rojo");
        System.out.println("\nFrecuencia del color rojo en la lista list2   : " + frecuencia);

        //Comprueba si list1 y list2 tienen elementos en común.
        boolean desunion = Collections.disjoint(list1, list2);

        System.out.printf("%nlist1 y list2 %s elementos en común%n", desunion ? "no tienen" : "tienen");
    }


}
