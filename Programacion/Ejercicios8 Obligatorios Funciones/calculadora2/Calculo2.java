package calculadora2;

import calculadora2.funciones2.FuncionesMath;

import java.util.Scanner;

public class Calculo2 {

    // ejemplo de calculadora sin creacion de objetos por ello usamos metodos static

    public static void main(String[] args) {
        FuncionesMath Calculator =new FuncionesMath();  
        Scanner s = new Scanner(System.in);

        // hemos creado un objeto para realizar otro ejemplo, basado en la clase
        // FuncionesMath

        System.out.print("indica el primer número; ");
        int a = s.nextInt();
        System.out.print("indica el segundor número; ");
        int b = s.nextInt();

        // invocamos los diferentes metodos
        System.out.println("Suma: " + Calculator.suma(a, b));
        System.out.println("Resta: " + Calculator.resta(a, b));
        System.out.println("Multi: " + Calculator.producto(a, b));
        System.out.println("Div: " + Calculator.division(a, b));

    }

}
