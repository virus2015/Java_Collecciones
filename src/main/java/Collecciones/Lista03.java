package Collecciones;

import java.util.ArrayList;
import java.util.List;

public class Lista03 {


    public static void main(String args[])
    {
        List<Clientes_ac2> lista = new ArrayList<>();

        Clientes_ac2 c1 = new Clientes_ac2("1", "MANUEL", "RODRIGUEZ", "AVALOS", "RDAVMN56061908H300");
        Clientes_ac2 c2 = new Clientes_ac2("2", "ESTELA", "HERNANDEZ", "RUIZ", "HRRZES55020210M500");
        Clientes_ac2 c3 = new Clientes_ac2("3", "MARIA ELENA", "DELGADO", "MARTINEZ", "DLMREL54081808M600");


        lista.add(c1);
        lista.add(c2);
        lista.add(c3);




        List<String> listData = new ArrayList<>();
        listData.add("JORGE");
        listData.add("REGINA");
        listData.add("ANDREA");

        List<String> listData2 = new ArrayList<>();
        listData.add("FERNANDO");
        listData.add("IGNACIO");
        listData.add("DOROTEA");

        listData2.addAll(listData);
        listData2.forEach(System.out::println);

    }

}
