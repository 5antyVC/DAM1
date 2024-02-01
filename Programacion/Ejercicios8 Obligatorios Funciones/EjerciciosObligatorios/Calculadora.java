import java.util.Scanner;
import java.lang.Math;

public class Calculadora {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //Pedimos los 2 numerps
        System.out.println("Indica el primer numero");
        int a = s.nextInt();
        System.out.println("Indica el segundo numero");
        int b = s.nextInt();
        //Imprimimos las operaciones llamando a las funciones y usando los parametros por argumento
        System.out.println("Suma= "+suma(a, b));
        System.out.println("Resta= "+resta(a, b));
        System.out.println("Multiplicacion= "+multiplicacion(a, b));
        System.out.println("Division= "+division(a, b));
        System.out.println("Raiz Cuadrado de b= "+raiz(b));
        System.out.println("Exponente de base "+a+" en "+b+"= "+Exponente(a, b));
    }

    //Creamos las funciones y devolvemos el resultado de la operacion 
    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }
    public static  double raiz(int a) {
        double raiz=Math.sqrt(a);
        return raiz;
    }

    public static  double Exponente(int a, int b) {
        double c=Math.pow(a,  b);
        return c;
    }
}
