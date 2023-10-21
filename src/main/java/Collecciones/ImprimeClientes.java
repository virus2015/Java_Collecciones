package Collecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImprimeClientes {


    public static void main(String[] args) {

        List<Clientes_ac2> lis = new ArrayList<>(Arrays.asList(obtenerClientes()));
        lis.forEach(System.out::println);

    }

    public static Clientes_ac2[] obtenerClientes(){

        Clientes_ac2 [] clientes = {

       new Clientes_ac2("1","MANUEL","RODRIGUEZ","AVALOS","RDAVMN56061908H300"),
       new Clientes_ac2("2","ESTELA","HERNANDEZ","RUIZ","HRRZES55020210M500"),
       new Clientes_ac2("3","MARIA ELENA","DELGADO","MARTINEZ","DLMREL54081808M600"),
        };
        return clientes;
    }


}
