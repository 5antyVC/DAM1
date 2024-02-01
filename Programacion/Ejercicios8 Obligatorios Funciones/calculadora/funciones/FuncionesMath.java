package calculadora.funciones;
import java.lang.Math;
public class FuncionesMath {
    
    public  static int suma(int a, int b) {
        return a + b;
    }

    public  static int resta(int a, int b) {
        return a - b;
    }

    public static  int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }
    public static double raiz(int a) {
        double raiz=Math.sqrt(a);
        return raiz;
    }

    public static double Exponente(int a, int b) {
        double c=Math.pow(a,  b);
        return c;
    }

}
