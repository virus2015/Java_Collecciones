package Collecciones.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class EliminarProductos {

    public static Producto[] obtenerProductos(){
        Producto[] productos = {
                new Producto("H&M", "Gris", "Pay", "33L"),
                new Producto("H&M", "Verde", "Pay", "34L"),
                new Producto("Zara", "Gris", "Coco", "35L"),
                new Producto("Lacoste", "Verde", "Crown", "36L"),
                new Producto("Farm", "Azul", "Holos", "37L"),
                new Producto("Ho!", "Gris", "Pay", "38L"),
                new Producto("H&M", "Gris", "Pay", "39L"),
                new Producto("H&M", "Gris", "Pay", "40L"),
                new Producto("Lacoste", "Gris", "Pay", "41L"),
                new Producto("Lacoste69", "Gris69", "Pay69", "42L")
        };

        return productos;
    }



    public static void main(String[] args) {

        //String [] marcas = {"H&M", "Lacoste"};
        String[] marcas = {"Farm", "Lacoste69"};

        List<Producto> productos = new ArrayList<>(Arrays.asList(obtenerProductos()));

        System.out.println("La lista antes de ser eliminada");

        productos.forEach(System.out::println);

        eliminarMarcasIterator(productos, Arrays.asList(marcas));

        //   eliminarMarcasStream(productos, Arrays.asList(marcas));

        System.out.println("\n\nProductos sin las marcas no deseadas: ");
        productos.forEach(System.out::println);
    }

    private static void eliminarMarcasIterator(List<Producto> productos, List<String> marcas){
        for(ListIterator<Producto> iterador = productos.listIterator(); iterador.hasNext(); ) {
            if(marcas.contains(iterador.next().getMarca())){
                iterador.remove();
            }
        }
    }

    private static void eliminarMarcasStream(List<Producto> productos, List<String> marcas){
        productos.removeIf((producto) -> marcas.contains(producto.getMarca()));
    }


    static class Producto {
        private String marca;
        private String color;
        private String modelo;
        private String talla;


        public Producto(String marca, String color, String modelo, String talla){
            this.marca = marca;
            this.color = color;
            this.modelo = modelo;
            this.talla = talla;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getTalla() {
            return talla;
        }

        public void setTalla(String talla) {
            this.talla = talla;
        }

        @Override
        public String toString() {
            return "Producto{" + "marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", talla=" + talla + '}';
        }

    }


}
