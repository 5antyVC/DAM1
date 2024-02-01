package Operacion;
import java.lang.Math;
public class Raiz2 extends Operacion{
    void operar() {
        double raiz2=Math.sqrt(valor2);
        resultado=(int) raiz2;
    }
}
