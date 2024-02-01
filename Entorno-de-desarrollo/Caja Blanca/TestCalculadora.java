import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
public class TestCalculadora {

    @Test
    public void testSuma() {
        int espera = 9;
        int actual = Calculadora.suma(6,3);
        assertEquals(espera, actual);
    }
    @Test
    public void testResta() {
        int espera = 2;
        int actual = Calculadora.resta(5,3);
        assertEquals(espera, actual);
    }
}