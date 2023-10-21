package Collecciones.MasterEnCollecciones_Udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator {


    public static void main(String[] args) {
        List<String> listaColores = new ArrayList<>();
        //Adición de elemento individuales
        listaColores.add("Azul");
        listaColores.add("Amarillo");
        listaColores.add("Morado");

       // List<String> elementos = new ArrayList<>(listaColores);

        ListIterator<String> iterador = listaColores.listIterator();

        System.out.println("\n\nRecorrido con iterador: ");
        while(iterador.hasNext()){
            System.out.println("Color: " + iterador.next());
        }

        System.out.println("\n\nRecorrido inverso con iterador: ");
        while(iterador.hasPrevious()){
            System.out.println("Color: " + iterador.previous());
        }

        while(iterador.hasNext()){
            if(iterador.next().equals("Amarillo")){
                iterador.remove();
            }
        }

        System.out.println("\n\nRecorrido con iterador sin amarillo: ");
        for(ListIterator<String> iter = listaColores.listIterator(); iter.hasNext(); ){
            System.out.println("Color last list : " + iter.next());
        }

    }
}
