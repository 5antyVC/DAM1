/*
Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =
0).
*/
public class Ej5_Ecuacion1Grado {
    public static void main(String[] args) {

        System.out.println("Por favor, introduce A: ");
        double A = Integer.parseInt(System.console().readLine());

        System.out.println("Por favor, introduce B: ");
        double B = Integer.parseInt(System.console().readLine());

        System.out.println("Su ecuacion quedaria asi " + A + "X+" + B);

        if (A == 0 || B == 0) {
            System.out.println("La ecuacuion no tiene solucion real ");

        } else {
            System.out.println("El resultado de su ecuacion es X=" + (-B / A));

        }

    }
}
