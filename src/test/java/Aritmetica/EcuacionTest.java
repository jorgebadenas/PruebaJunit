package Aritmetica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EcuacionTest {
    @Test
    public void terminoIndependienteCeroTest() {
        Ecuacion ecuacion = new Ecuacion(1, 0); // x + 0 = 0
        assertEquals(ecuacion.resolver(), 0.0);

        ecuacion = new Ecuacion(0, 0); // 0x + 0 = 0
        assertEquals(ecuacion.resolver(), Double.POSITIVE_INFINITY);
    }

    @Test
    public void distintosDeCeroTest() {
        Ecuacion ecuacion = new Ecuacion(1, 1); // x + 1 = 0
        assertEquals(ecuacion.resolver(), -1.0);

        ecuacion = new Ecuacion(2, 1); // 2x + 1 = 0
        assertEquals(ecuacion.resolver(), 0.0);
    }

}