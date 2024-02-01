/*
Realiza un programa que calcule la media de tres notas.
*/

public class Ej7_Media3Notras {
    public static void main(String[] args) {
        System.out.println("Por favor, introduce la primera nota: ");
        int A = Integer.parseInt(System.console().readLine());
        System.out.println("Por favor, introduce la segunda nota: ");
        int B = Integer.parseInt(System.console().readLine());
        System.out.println("Por favor, introduce la ultima nota: ");
        int C = Integer.parseInt(System.console().readLine());


        System.out.println("La media de sus notas es "+((A+B+C)/3));
    }
}
