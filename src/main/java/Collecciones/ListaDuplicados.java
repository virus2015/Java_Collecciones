package Collecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListaDuplicados {

    public static void main(String args[]) {

        List<String> lista = new ArrayList<>();

        lista.add("JORGE");
        lista.add("KARLA");
        lista.add("KARLA");
        lista.add("VERONICA");
        lista.add("VALENTINA");
        lista.add("VALENTINA");

        List<String> mi_lista = lista.stream()
                .collect(Collectors.groupingBy(s->s))
                .entrySet()
                .stream()
                .filter(e->e.getValue().size()>1)
                .map(e-> e.getKey()).collect(Collectors.toList());

                for (String nombres : mi_lista ){
                    System.out.println(nombres);
                    System.out.println(" get byte"+nombres.getBytes());
                }




    }
}
