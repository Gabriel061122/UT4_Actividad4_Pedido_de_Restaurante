package App;

import PedidoRestaurante.*;
import Excepciones.*;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HashSet<Articulo> articulos = new HashSet<>();
        articulos.add(new Articulo("Teclado MX", 99.99));
        articulos.add(new Articulo("Ratón MX", 59.99));
        articulos.add(new Articulo("Monitor IPS 4k", 199.99));
        articulos.add(new Articulo("SSD 1TB", 56.50));
        articulos.add(new Articulo("RAM 2x16 DDR5", 599.99));
        articulos.add(new Articulo("Fuente Alimentación 700W", 129.99));


        while(true){
            System.out.println("Hola!");
            imprimirArticulos(articulos);
            imprimirMenu();

        }
    }

    public static void imprimirArticulos(HashSet<Articulo> articulos){
        System.out.println("Se muestran los productos disponibles:");
        int i = 1;

        for(Articulo articulo: articulos){
            System.out.println(i + ". " + articulo.getNombre()+" "+articulo.getPrecio()+"\n");
        }
    }

    public static void imprimirMenu(){
        System.out.println("========================\nOPCIONES DISPONIBLES\n========================");
        System.out.println("1. Listar articulos");
        System.out.println("2. Buscar articulo");
        System.out.println("3. Consultar Pedido");
        System.out.println("4. Añadir articulo a Pedido");
        System.out.println("5. Eliminar articulo de Pedido");
        System.out.println("6. Aumentar cantidad de articulo en un pedido");
        System.out.println("7. Disminuir cantidad de articulo en un pedido");
        System.out.println("8. Salir");
    }

    public static void buscarArticulo(HashSet<Articulo> articulos, String nombre){
        int i = 1;
        for (Articulo articulo: articulos){
            if (articulo.getNombre().contains(nombre)){
                System.out.println(i + ". " + articulo.getNombre()+" "+articulo.getPrecio()+"\n");
                i++;
            }
        }
    }

    public static int obtenerNumero
}
