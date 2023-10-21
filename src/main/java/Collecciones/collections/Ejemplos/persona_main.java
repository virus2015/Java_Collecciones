package Collecciones.collections.Ejemplos;


import Collecciones.Clientes_ac2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class persona_main {


    public static void main(String[] args) {
    List<Persona> pers = new ArrayList<>(Arrays.asList(metodoPersona()));
        pers.forEach(System.out::println);

    }

    public static Persona[]  metodoPersona(){

        Persona[]  persona ={
            new  Persona ("1","MANUEL","RODRIGUEZ","AVALOS","RDAVMN56061908H300"),
            new Persona("2","ESTELA","HERNANDEZ","RUIZ","HRRZES55020210M500")};
        return  persona;
    }


}
