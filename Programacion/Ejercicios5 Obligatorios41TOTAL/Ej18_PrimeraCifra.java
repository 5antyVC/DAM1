/*
Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado. Se permiten números de hasta 5 cifras.

*/

public class Ej18_PrimeraCifra {
    public static void main(String[] args) {

        System.out.println("Por favor, introduce tu numero : ");
        int A = Integer.parseInt(System.console().readLine());
        int num = A / 10;

        System.out.println("Su primera cifra es  " + num);

    }
}
