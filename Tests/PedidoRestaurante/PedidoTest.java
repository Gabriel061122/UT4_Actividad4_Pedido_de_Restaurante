package PedidoRestaurante;

import Excepciones.CantidadInvalidaDeArticulo;
import Excepciones.LimiteArticulosAlcanzadoException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PedidoTest {

    @Test
    void constructorDebeInicializarNombreClienteYEstado() {
        Pedido pedido = new Pedido("Gabriel");

        String valorEsperadoNombre = "Gabriel";
        String valorRealNombre = pedido.getNombreCliente();
        assertEquals(valorEsperadoNombre, valorRealNombre);

        EstadoPedido valorEsperadoEstado = EstadoPedido.EN_PREPARACION;
        EstadoPedido valorRealEstado = pedido.getEstado();
        assertEquals(valorEsperadoEstado, valorRealEstado);
    }

    @Test
    void anyadirArticuloDebeAgregarCantidadInicialUno() throws Exception {
        Pedido pedido = new Pedido("Cliente");
        Articulo articulo = new Articulo("Pizza", 12.0);

        pedido.anyadirArticulo(articulo);

        int valorEsperado = 1;
        int valorReal = pedido.getListaArticulos().get(articulo);
        assertEquals(valorEsperado, valorReal);
    }

    @Test
    void eliminarArticuloDebeQuitarArticuloDeLaLista() throws Exception {
        Pedido pedido = new Pedido("Cliente");
        Articulo articulo = new Articulo("Ensalada", 8.0);
        pedido.anyadirArticulo(articulo);

        pedido.eliminarArticulo(articulo);

        int valorEsperado = 0;
        int valorReal = pedido.getListaArticulos().size();
        assertEquals(valorEsperado, valorReal);
    }

    @Test
    void aumentarCantidadDebeIncrementarEnUno() throws Exception {
        Pedido pedido = new Pedido("Cliente");
        Articulo articulo = new Articulo("Pasta", 10.0);
        pedido.anyadirArticulo(articulo);

        pedido.aumentarCantidad(articulo);

        int valorEsperado = 2;
        int valorReal = pedido.getListaArticulos().get(articulo);
        assertEquals(valorEsperado, valorReal);
    }

    @Test
    void diminuirCantidadDebeDecrementarEnUno() throws Exception {
        Pedido pedido = new Pedido("Cliente");
        Articulo articulo = new Articulo("Sopa", 5.0);
        pedido.anyadirArticulo(articulo);
        pedido.aumentarCantidad(articulo);

        pedido.diminuirCantidad(articulo);

        int valorEsperado = 1;
        int valorReal = pedido.getListaArticulos().get(articulo);
        assertEquals(valorEsperado, valorReal);
    }


    @Test
    void calcularTotalDebeRetornarSumaDeImportes() throws Exception {
        Pedido pedido = new Pedido("Cliente");
        Articulo articulo1 = new Articulo("Bebida", 2.5);
        Articulo articulo2 = new Articulo("Bocadillo", 6.0);
        pedido.anyadirArticulo(articulo1);
        pedido.anyadirArticulo(articulo2);
        pedido.aumentarCantidad(articulo2);

        double valorEsperado = 14.5;
        double valorReal = pedido.calcularTotal();
        assertEquals(valorEsperado, valorReal);
    }

    @Test
    void listoParaEntregarDebeCambiarEstadoDesdeEnPreparacion() {
        Pedido pedido = new Pedido("Cliente");

        pedido.listoParaEntregar();

        EstadoPedido valorEsperado = EstadoPedido.LISTO_PARA_ENTREGAR;
        EstadoPedido valorReal = pedido.getEstado();
        assertEquals(valorEsperado, valorReal);
    }

    @Test
    void entregadoDebeCambiarEstadoSoloSiEstaListo() {
        Pedido pedido = new Pedido("Cliente");
        pedido.listoParaEntregar();

        pedido.entregado();

        EstadoPedido valorEsperado = EstadoPedido.ENTREGADO;
        EstadoPedido valorReal = pedido.getEstado();
        assertEquals(valorEsperado, valorReal);
    }
}
