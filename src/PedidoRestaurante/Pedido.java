package PedidoRestaurante;


import Excepciones.CantidadInvalidaDeArticulo;
import Excepciones.LimiteArticulosAlcanzadoException;

import java.util.*;

public class Pedido {

    private static int idPedido = (int)(Math.random()*1000000);
    private HashMap<Articulo, Integer> listaArticulos = new HashMap<>();
    private String nombreCliente;

    private EstadoPedido estado;

    public Pedido(String nombreCliente)  {
        this.nombreCliente = nombreCliente;
        this.estado = EstadoPedido.EN_PREPARACION;
    }

    public void anyadirArticulo(Articulo articulo) throws Exception {
        if (listaArticulos.size() < 5) {
            listaArticulos.put(articulo, 1);
        } else {throw new LimiteArticulosAlcanzadoException();}

    }

    public void eliminarArticulo(Articulo articulo) {
        listaArticulos.remove(articulo);
    }

    public void aumentarCantidad(Articulo articulo) {
        int cantidad = listaArticulos.get(articulo);
        listaArticulos.put(articulo, cantidad+1);
    }

    public void diminuirCantidad(Articulo articulo) throws CantidadInvalidaDeArticulo {
        int cantidad = listaArticulos.get(articulo);
        if(cantidad == 1) throw new CantidadInvalidaDeArticulo();
        listaArticulos.put(articulo, cantidad-1);
    }

    public void printPedido() {

        int index = 0;
        Articulo[] articulos =  listaArticulos.keySet().toArray(new Articulo[listaArticulos.size()]);
        Collection<Integer> cantidades = listaArticulos.values();

        for  (Integer cantidad : cantidades) {
            System.out.println(articulos[index].getNombre()+", CANTIDAD: "+cantidad + ", PRECIO POR UNIDAD: " + articulos[index].getPrecio());
        }

        System.out.println("PRECIO TOTAL: " + calcularTotal());
        System.out.println("ID PEDIDO: " + idPedido);

    }

    public double calcularTotal(){

        double total = 0;
        int index = 0;

        Articulo[] articulos =  listaArticulos.keySet().toArray(new Articulo[listaArticulos.size()]);
        Collection<Integer> cantidades = listaArticulos.values();
        for (Integer cantidad : cantidades) {
            total += cantidad*articulos[index].getPrecio();
            index++;
        }
        return total;
    }

    public void listoParaEntregar() {
        if (this.estado == EstadoPedido.EN_PREPARACION) {
            this.estado = EstadoPedido.LISTO_PARA_ENTREGAR;
        } else System.out.println("No es posible establecer el paquete como 'listo para entregar'");

    }

    public void entregado(){
        if (this.estado == EstadoPedido.LISTO_PARA_ENTREGAR) {
            this.estado = EstadoPedido.ENTREGADO;
        } else System.out.println("No es posible establecer el paquete como entregado");
    }


    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public HashMap<Articulo, Integer> getListaArticulos() {
        return this.listaArticulos;
    }

    public static int getIdPedido() {
        return idPedido;
    }

    public EstadoPedido getEstado() {
        return this.estado;
    }
}


