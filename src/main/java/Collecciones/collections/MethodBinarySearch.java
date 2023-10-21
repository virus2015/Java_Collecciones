package Collecciones.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodBinarySearch {


    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(6);
        numeros.add(8);
        numeros.add(8);
        numeros.add(1);
        numeros.add(9);
        numeros.add(11);

        numeros.indexOf(9);
        Collections.sort(numeros);

        System.out.println("\n");
        System.out.println("Los numeros son: "+numeros);
        int indice = Collections.binarySearch(numeros, 11);

        System.out.println("Él índice del número  es: " + indice);
       /* for(Integer numero : numeros){

          System.out.println(numero.toString());
        }*/

    }

}
