package Collecciones.MasterEnCollecciones_Udemy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapsExamples {


    public static void main(String[] args) {
        Map<String,String> hashpmap = new HashMap<>();
        Map<String,String> linkedHasMap  = new LinkedHashMap<>();

        hashpmap.put("Uno","Jorge");
        hashpmap.put("Dos","Camila");
        hashpmap.put("Tres","Lucia");
        hashpmap.put("cuatro", "Sebastián");
        hashpmap.put("cinco", "Eduardo");
        hashpmap.put("seis", "Rodrigo");
        hashpmap.put("siete", "Yadira");
        hashpmap.put("ocho", "Sofia");
        hashpmap.put("nueve", "Oyuki");
        hashpmap.put("diez", "Concepción");
        hashpmap.put("once", "Silvia");
        hashpmap.put("doce", "Adriana");
        hashpmap.put("trece", "Jacinto");
        hashpmap.put("catorce", "Javier");
        hashpmap.put("quince", "Arturo");
        hashpmap.put("dieciseis", "Irma");

        System.out.println("hashMap: " + hashpmap);

        //Iterar un hashmap
        for(Map.Entry<String,String> entrada : hashpmap.entrySet()){
            System.out.println("People : " +entrada.getValue()+" , " +  entrada.getKey());

        }

        //Los elementos en un mapa de tipo LinkedHashMap, mantienen el orden de inserción.
        linkedHasMap.put("uno", "Andres");
        linkedHasMap.put("dos", "Jaime");
        linkedHasMap.put("tres", "Felipe");
        linkedHasMap.put("cuatro", "Sebastián");
        linkedHasMap.put("cinco", "Eduardo");
        linkedHasMap.put("seis", "Rodrigo");
        linkedHasMap.put("siete", "Yadira");
        linkedHasMap.put("ocho", "Sofia");
        linkedHasMap.put("nueve", "Oyuki");
        linkedHasMap.put("diez", "Concepción");
        linkedHasMap.put("once", "Silvia");
        linkedHasMap.put("doce", "Adriana");
        linkedHasMap.put("trece", "Jacinto");
        linkedHasMap.put("catorce", "Javier");
        linkedHasMap.put("quince", "Arturo");
        linkedHasMap.put("dieciseis", "Irma");

        for (Map.Entry<String, String> entry : linkedHasMap.entrySet()) {
            System.out.println("People linked " + entry.getKey()+ " " + entry.getValue());
        }


    }
}
