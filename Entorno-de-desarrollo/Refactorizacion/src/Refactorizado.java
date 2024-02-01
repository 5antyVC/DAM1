
public class Refactorizado {
    static int a = 2;
    static int b = 3;
    public static int suma() {
        return a + b;
    }

    public static int resta() {
        return (int) a - b;
    }

    public static int multi() {
        return a * b;

    }

    public static int div() {
        return a / b;

    }

    private static double pot() {
        return Math.pow(a, b);
    }

    private static double raiz(double a) {
        return Math.sqrt(a);
    }

    public static void Mostrar(double d) {
        System.out.println("El restulado es " + d);
    }

    public static void main(String[] args) {
        
        Mostrar(suma());
        Mostrar(resta());
        Mostrar(multi());
        Mostrar(div());
        Mostrar(pot());
        Mostrar(raiz(a));
        Mostrar(raiz(b));

    }

}