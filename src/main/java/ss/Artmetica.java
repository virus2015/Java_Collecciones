package ss;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Artmetica {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int [] array = generarArrayAleatorio();
        System.out.println("Array sin ordenar");
        System.out.println(Arrays.toString(array));

        int []arrayOrdenado  = Arrays.stream(array).sorted().toArray();
        System.out.println("Array ordenado");
        System.out.println(Arrays.toString(arrayOrdenado));

        List<String> capitales = Arrays.asList("Al","Jaén", "Córdoba", "Sevilla", "Huelva", "Cádiz", "Málaga", "Granada",
                "Almería" );

        capitales.stream().sorted((s1,s2)-> -s1.compareTo(s2)).forEach(System.out::println);
    }

    public static int[] generarArrayAleatorio(){

        return new Random().ints(100,0,1000).toArray();
    }



}
