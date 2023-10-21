package Seccion_02_Listas_En_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class EliminarProductos {

 //   private static List<Producto> productos;

    public static Producto[] obtenerProductos(){
        Producto[] productos = {
                new Producto("NIKE", "Gris", "Pay", "33L"),
                new Producto("ADIDAS", "Verde", "Pay", "34L"),
                new Producto("Zara", "Gris", "Coco", "35L"),
                new Producto("Lacoste", "Verde", "Crown", "36L"),
                new Producto("Farm", "Azul", "Holos", "37L"),
                new Producto("Ho!", "Gris", "Pay", "38L")


        };

        return productos;
    }
    public static void main(String[] args) {
        String [] marcas = {"ADIDAS", "Zara"};
        List<Producto> productos = new ArrayList<>(Arrays.asList(obtenerProductos()));

        System.out.println("La lista antes de ser eliminada");

        productos.forEach(System.out::println);
        eliminarMarcasIterator(productos, Arrays.asList(marcas));

        System.out.println("\n\nProductos sin las marcas no deseadas: ");
        productos.forEach(System.out::println);
    }
    private static void eliminarMarcasStream(List<Producto> productos, List<String> marcas){
        productos.removeIf((producto) -> marcas.contains(producto.getMarca()));
    }

    private static void eliminarMarcasIterator(List<Producto> productos, List<String> marcas){
        for(ListIterator<Producto> iterador = productos.listIterator(); iterador.hasNext(); ) {
            if(marcas.contains(iterador.next().getMarca())){
                iterador.remove();
            }
        }
    }
}
