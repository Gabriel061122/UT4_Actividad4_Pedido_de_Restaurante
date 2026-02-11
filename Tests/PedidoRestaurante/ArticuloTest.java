package PedidoRestaurante;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArticuloTest {

    @Test
    void constructorDebeInicializarNombreYPrecio() {
        Articulo articulo = new Articulo("Hamburguesa", 9.5);

        String valorEsperadoNombre = "Hamburguesa";
        String valorRealNombre = articulo.getNombre();
        assertEquals(valorEsperadoNombre, valorRealNombre);

        double valorEsperadoPrecio = 9.5;
        double valorRealPrecio = articulo.getPrecio();
        assertEquals(valorEsperadoPrecio, valorRealPrecio);
    }

    @Test
    void setNombreDebeActualizarNombre() {
        Articulo articulo = new Articulo("Refresco", 2.0);
        articulo.setNombre("Agua");

        String valorEsperado = "Agua";
        String valorReal = articulo.getNombre();
        assertEquals(valorEsperado, valorReal);
    }

    @Test
    void setPrecioDebeActualizarPrecio() {
        Articulo articulo = new Articulo("Patatas", 3.0);
        articulo.setPrecio(3.75);

        double valorEsperado = 3.75;
        double valorReal = articulo.getPrecio();
        assertEquals(valorEsperado, valorReal);
    }
}
