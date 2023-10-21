package Seccion_02_Listas_En_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Listas {


    public static void main(String[] args) {

        List<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("MORA");
        listaFrutas.add("BETABEL");
      //  listaFrutas.forEach(System.out::println);



        String arreglo [] ={"Manzanas","Peras","Piña"};
        List<String> listafru = Arrays.asList(arreglo);
        ///para imprimir

      //  listafru.forEach(System.out::println);

       //Se puede crear otra lista apartir de otra lista

        List<String> listaFrt77 = new ArrayList<>(listaFrutas);

       // listaFrt77.forEach(System.out::println);

        //Se agrega una lista a otra lista

        listaFrt77.addAll(listafru);

    //    listaFrt77.forEach(System.out::println);

     //Para iterar es de la siguiente manera

        ListIterator<String> itera = listaFrt77.listIterator();

        while(itera.hasNext()){
      //  System.out.println("DATA: "+itera.next());

        }

       /* while(itera.hasNext()){
            if(itera.next().equals("BETABEL")){
                itera.remove();
            }
            System.out.println("DATA: "+itera.next());
        }*/
      /*  for (ListIterator<String> iter = listaFrt77.listIterator(); iter.hasNext();){
            System.out.println("DATA: "+iter.next());
        }
*/

















    }
}
