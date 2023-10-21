package Collecciones.collections;

import java.util.Arrays;
import java.util.List;

public class cp_CollectionsMethods2 {

    public static void main(String[] args) {
        String [] lista = {"red","blue","white","purple","black"};
        List<String> convertMaTaList = Arrays.asList(lista);

        imprimir(convertMaTaList);
    }

     public static  void imprimir(List<String> lista){

        for (String li : lista){

            System.out.println(li.toString());
        }

     }
}
