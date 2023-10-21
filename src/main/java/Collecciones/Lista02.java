package Collecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista02 {


    public static void main(String[] args) {

        List<Clientes_ac2> lista = new ArrayList<>();

        Clientes_ac2 c1 = new Clientes_ac2("1", "MANUEL", "RODRIGUEZ", "AVALOS", "RDAVMN56061908H300");
        Clientes_ac2 c2 = new Clientes_ac2("2", "ESTELA", "HERNANDEZ", "RUIZ", "HRRZES55020210M500");
        Clientes_ac2 c3 = new Clientes_ac2("3", "MARIA ELENA", "DELGADO", "MARTINEZ", "DLMREL54081808M600");


        lista.add(c1);
        lista.add(c2);
        lista.add(c3);

        lista.iterator();

        imprimirLista(lista);
    }


    private static void imprimirLista(List<Clientes_ac2> lista){
         for (Clientes_ac2 li : lista) {
            System.out.println("valores : "+ Arrays.asList(li).toString());

        }
    }


}
