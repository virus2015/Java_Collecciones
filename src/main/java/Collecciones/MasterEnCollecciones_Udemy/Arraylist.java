package Collecciones.MasterEnCollecciones_Udemy;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<String> mi_array = new ArrayList<>();

        mi_array.add("UNO");
        mi_array.add("DOS");
        mi_array.add("TRES");
        System.out.print("ANTES DEL CAMBIO");
        mi_array.forEach(System.out::println);
        mi_array.set(1,"CUATRO");
        System.out.print("AFTER DEL CAMBIO ");
        mi_array.forEach(System.out::println);
    }
}
