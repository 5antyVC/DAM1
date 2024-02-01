package testjunit;

import static org.junit.Assert.*;

import org.junit.Test;
public class testCalculadora {

    @Test
    public void testSuma(){
        int espera=5;
        int actual=Calculadora.suma(2, 3);
        assertEquals(espera,actual);
    }
    @Test
    public void testResta(){
        int espera=2;
        int actual=Calculadora.resta(5, 3);
        assertEquals(espera,actual);

    }
    @Test
    public void testMulti(){
        int espera=15;
        int actual=Calculadora.multi(5, 3);
        assertEquals(espera,actual);

    }
    @Test
    public void testDiv(){
        int espera=1;
        int actual=Calculadora.div(5, 5);
        assertEquals(espera,actual);

    }
    @Test
    public void testRaizA(){
        int espera=2;
        int actual=(int)Calculadora.raiza(4);
        assertEquals(espera,actual);

    }
    @Test
    public void testRaizB(){
        int espera=3;
        int actual=(int)Calculadora.raizb(9);
        assertEquals(espera,actual);

    }
    @Test
    public void testExp(){
        int espera=4;
        int actual=(int)Calculadora.expAB(2, 2);
        assertEquals(espera,actual);

    }
    

}
