package testjunit;

public class Calculadora {

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static double raiza(int a) {
        double raiz = Math.sqrt(a);
        return raiz;
    }

    public static double raizb(int b) {
        double raiz = Math.sqrt(b);
        return raiz;
    }

    public static double expAB(int a, int b) {
        double exp = Math.pow(a, b);
        return exp;
    }

}
