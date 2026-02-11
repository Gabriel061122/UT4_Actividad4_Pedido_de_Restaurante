package Excepciones;

/*El propósito de esta clase es demostrar que las excepciones personalizadas ocurren, ya que no me pareció correcto colocarlo en los tests de JUnit
* */

import PedidoRestaurante.Articulo;
import PedidoRestaurante.Pedido;

import java.util.Scanner;

public class ExcepcionesTest {


    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoja la excepción que desea que se demuestre:\n1. LimiteArticulosAlcanzadoExcepcion\n2. CantidadInvalidaDeArticulo");
        int numero = sc.nextInt();
        if (numero == 1) {
            Pedido pedido = new Pedido("Aleatorio");
            pedido.anyadirArticulo(new Articulo("Articulo1", 0.99));
            pedido.anyadirArticulo(new Articulo("Articulo1", 0.99));
            pedido.anyadirArticulo(new Articulo("Articulo1", 0.99));
            pedido.anyadirArticulo(new Articulo("Articulo1", 0.99));
            pedido.anyadirArticulo(new Articulo("Articulo1", 0.99));
            pedido.anyadirArticulo(new Articulo("Articulo1", 0.99));
            pedido.printPedido();
        } else if (numero == 2) {

            Pedido pedido = new Pedido("Aleatorio");
            Articulo articulo1 = new Articulo("Articulo1", 0.99);
            pedido.anyadirArticulo(articulo1 );
            pedido.diminuirCantidad(articulo1);
        }
    }
}
