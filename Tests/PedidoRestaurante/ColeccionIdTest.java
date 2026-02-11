package PedidoRestaurante;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColeccionIdTest {

    @Test
    void agregarIdDebeRetornarTrueCuandoEsNuevo() {
        ColeccionId coleccionId = new ColeccionId();

        boolean valorEsperado = true;
        boolean valorReal = coleccionId.agregarId(10);
        assertEquals(valorEsperado, valorReal);
    }

    @Test
    void agregarIdDebeRetornarFalseCuandoEstaRepetido() {
        ColeccionId coleccionId = new ColeccionId();
        coleccionId.agregarId(25);

        boolean valorEsperado = false;
        boolean valorReal = coleccionId.agregarId(25);
        assertEquals(valorEsperado, valorReal);
    }

    @Test
    void existeIdDebeRetornarTrueSiExiste() {
        ColeccionId coleccionId = new ColeccionId();
        coleccionId.agregarId(40);

        boolean valorEsperado = true;
        boolean valorReal = coleccionId.existeId(40);
        assertEquals(valorEsperado, valorReal);
    }

    @Test
    void existeIdDebeRetornarFalseSiNoExiste() {
        ColeccionId coleccionId = new ColeccionId();
        coleccionId.agregarId(80);

        boolean valorEsperado = false;
        boolean valorReal = coleccionId.existeId(99);
        assertEquals(valorEsperado, valorReal);
    }
}
