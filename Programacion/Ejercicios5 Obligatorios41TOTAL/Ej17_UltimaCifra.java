/*
Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
*/
public class Ej17_UltimaCifra {
    public static void main(String[] args) {

        System.out.println("Por favor, introduce tu numero : ");
        int A = Integer.parseInt(System.console().readLine());
        int num = A % 10;

        System.out.println("Su ultima cifra es  " + num);

    }

}
