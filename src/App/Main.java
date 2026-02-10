package App;

import PedidoRestaurante.*;
import Excepciones.*;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HashSet<Articulo> articulos = new HashSet<>();
        articulos.add(new Articulo("Paella de mariscos", 18.50));
        articulos.add(new Articulo("Hamburguesa gourmet", 12.99));
        articulos.add(new Articulo("Pizza cuatro quesos", 14.75));
        articulos.add(new Articulo("Ensalada César", 9.50));
        articulos.add(new Articulo("Salmón a la plancha", 21.90));
        articulos.add(new Articulo("Tarta de chocolate", 6.80));


        while(true){
            System.out.println("Hola!");
            imprimirArticulos(articulos);
            System.out.println("\n");
            imprimirMenu();
            int opcion = obtenerOpcionMenu();
            if(opcion == 1){
                imprimirArticulos(articulos);
                System.out.println("\n");
            } else if(opcion == 2){
                buscarArticulo(articulos, sc.nextLine());
                System.out.println("\n");
            } else if(opcion == 3){

            }
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

    public static int obtenerNumero(int limite){
        while(true){
            try{
                int numero = sc.nextInt();
                if(numero >= 1 && numero <= limite){
                    return numero;
                }
            } catch (Exception e) {
            }
        }
    }

    public static int obtenerOpcionMenu(){
        return obtenerNumero(8);
    }
}
