package Pedido_de_Restaurante;

class Pedido_Restaurante {
    public enum EstadoPedido {
        EN_PREPARACION,
        LISTO_PARA_ENTREGAR,
        ENTREGADO
    }
    public class Articulo {
        private String nombre;
        private int cantidad;
        private double precio;

        public Articulo(String nombre, int cantidad, double precio) {
            this.nombre = nombre;
            this.cantidad = cantidad;
            this.precio = precio;
        }
    }
    public class Pedido {

        private static int contadorPedidos = 1;

        private int idPedido;
        private String nombreCliente;
        private Articulo[] articulos;
        private int cantidadArticulos;
        private double precioTotal;
        private EstadoPedido estado;

        public Pedido(String nombreCliente) {
            this.idPedido = contadorPedidos++;
            this.nombreCliente = nombreCliente;
            this.articulos = new Articulo[5];
            this.cantidadArticulos = 0;
            this.precioTotal = 0.0;
            this.estado = EstadoPedido.EN_PREPARACION;
        }
    }

}
