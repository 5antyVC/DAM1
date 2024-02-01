package calculadora;

import calculadora.funciones.FuncionesMath;;

public class Calculo {

    public static void main(String[] args) {
        
        int a, b;
        System.out.println("Introduzca a:");
        a = Integer.parseInt(System.console().readLine());
        System.out.println("Introduzca b:");

        b = Integer.parseInt(System.console().readLine());

        System.out.println("Suma= " + calculadora.funciones.FuncionesMath.suma(a, b));
        System.out.println("Resta= " + calculadora.funciones.FuncionesMath.resta(a, b));
        System.out.println("Multiplicacion= " + calculadora.funciones.FuncionesMath.multiplicacion(a, b));
        System.out.println("Resta= " + calculadora.funciones.FuncionesMath.division(a, b));
        System.out.println("Raiz de "+a+"= "  + calculadora.funciones.FuncionesMath.raiz(a));
        System.out.println("Raiz de "+b+ "= "+calculadora.funciones.FuncionesMath.raiz(b));
        System.out.println("Base de "+ a +" Con Exponente "+b +"= "+ calculadora.funciones.FuncionesMath.Exponente(a, b));



    }
}
