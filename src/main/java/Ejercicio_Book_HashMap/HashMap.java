package Ejercicio_Book_HashMap;


import java.util.Iterator;
import java.util.Scanner;

public class HashMap {

    public static void main(String[ ] args) {

        java.util.HashMap<String, Float> listaProductos = new java.util.HashMap<>( ); //Declaración
        Scanner sc = new Scanner(System.in); //objeto sc para lectura en consola
        int opcionElegida = 0;
        float precio;
        String codigo;
        while (opcionElegida != 5) {
            System.out.println("Menú de opciones:");
            System.out.println("1.- Insertar producto");
            System.out.println("2.- Modicar precio");
            System.out.println("3.- Mostrar todos los productos");
            System.out.println("4.- Eliminar producto");
            System.out.println("5.- Salir");
            opcionElegida = sc.nextInt( ); //Se lee la opción elegida del menú
            switch (opcionElegida) {
                case 1://Insertar un producto al HashMap
                    System.out.println("Digite el códido del producto:");
                    codigo = sc.next( );
                    System.out.println("Digite el precio del producto:");
                    precio = sc.nextFloat( );
                    guardarProducto(codigo, precio, listaProductos); //Método que inserta
                    break;
                case 2://Modifica un producto ya existente
                    System.out.println("Introduce el códido del producto a cambiar:");
                    codigo = sc.next( );
                    modicaPrecio(codigo, listaProductos);//Método que modica precio
                    break;
                case 3://Muestra la lista de productos
                    mostrarProductos(listaProductos);//Muestra todos los productos
                    break;
                case 4://Elimina un producto existente
                    System.out.println("Introduce el código del producto a eliminar:");
                    codigo = sc.next( );
                    eliminaProducto(codigo, listaProductos);//Método que elimina
                    break;

                case 5:
                    break; // Si la opcion es 5 no se hace nada
                default:
                    System.out.println("Opción inválida");
            }
            System.out.println("\n");
        }
    }//Fin del main

    public static void guardarProducto(String codigo, float precio, java.util.HashMap<String,Float> listaProductos) {
        if (listaProductos.containsKey(codigo)) { //No permite duplicados
            System.out.println("Imposible introducir el producto. El código repetido.");
        } else {
            listaProductos.put(codigo, precio);//Guarda el producto en el    HashMap
        }
    }
    public static void modicaPrecio(String codigo, java.util.HashMap<String, Float> listaProductos) {
        Scanner sc = new Scanner(System.in);
        if (listaProductos.containsKey(codigo)) {
            System.out.println("Introduce el nuevo precio del producto:");
            listaProductos.put(codigo, sc.nextFloat( )); //Actualiza el precio
        } else {
            System.out.println("No hay ningun producto con ese código.");
        }
    }

    public static void mostrarProductos(java.util.HashMap<String, Float> listaProductos)
    {
        String clave;
        Iterator<String> productos = listaProductos.keySet( ).iterator( );
        System.out.println("Listado de productos:\n");
        System.out.println("Código\t Precio");
        while (productos.hasNext( )) {
            clave = productos.next( );
            System.out.println(clave + "\t " + listaProductos.get(clave));
        }
    }

    public static void eliminaProducto(String codigo, java.util.HashMap<String, Float> listaProductos) {
        if (listaProductos.containsKey(codigo)) {
            listaProductos.remove(codigo);
        } else {
            System.out.println("No hay ningun producto con ese código.");
        }
    }


}
