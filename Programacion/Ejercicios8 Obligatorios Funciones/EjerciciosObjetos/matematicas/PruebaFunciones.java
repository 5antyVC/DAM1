package matematicas;

import matematicas.Geometria;
import matematicas.varias.varias;
import java.util.Scanner;

public class PruebaFunciones {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca un numero entero positivo");
        int n = s.nextInt();

        if (matematicas.varias.varias.esPrimo(n)) {
            System.out.println("El " + n + " es primo");

        } else {
            System.out.println("El " + n + " no es primo");
        }

        System.out.println("Introduzca un numero entero positivo");
        n = s.nextInt();
        System.out.println(n + " tiene " + matematicas.varias.varias.digitos(n) + " digitos");

        double r, h;
        System.out.println("calculo del volumen de un cilindro");
        System.out.print("Introduzca el radio en metros: ");
        r=s.nextInt();
        System.out.print("introduzca la altura en metros: ");
        h=s.nextInt();
        System.out.println("El volumen del cilindro es "+matematicas.Geometria.volumenCilintro(r,h)+" m3");


    }
}
