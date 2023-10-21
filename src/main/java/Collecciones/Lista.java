package Collecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista {

    public static void main(String args[])
    {
        List<Persona> lista = new ArrayList<Persona>();

        lista.add(new Persona(1,"Jose","Hernandez"));
        lista.add(new Persona(2,"Veronica","lopez"));
        lista.add(new Persona(3,"Escarlet","Gomez"));
        lista.add(new Persona(4,"Estefania","Hernandez"));

        for(Persona personita: lista){
         //   System.out.println("La lista de Personas es : "+ Arrays.asList(personita.toString()));
            System.out.println("La personita es :"+  personita.getId());
        }
        /////////////2//////////////////////////////////
        ///Ejemplo otra lista
        List<String> listData = new ArrayList<>();
        listData.add("JORGE");
        listData.add("REGINA");
        listData.add("ANDREA");
       // System.out.println("Aqui se empieza a iterar la lista");
     //   listData.forEach(System.out::println);

       //Ahora vamos a poner un arreglo
        String arreglo []  = {"NOROÑA","GONZALEZ","FEDERICO","JAMES"};

        for (int i =0;i< arreglo.length;i++){
           // System.out.println("Los elementos del arreglo son :"+ arreglo[i]);

        }
       ////Meter un arreglo a una lista
        String [] nombres = {"Arturo", "Daniel", "JAvier", "Gustavo", "Pamela"};

        List<String> nombresVar  = Arrays.asList(nombres);
        //Itera la lista
        System.out.println("Los elementos del arreglo ----: ");
       // nombresVar.forEach(System.out::println);

        nombresVar.addAll(listData);

        //





    }


    }

