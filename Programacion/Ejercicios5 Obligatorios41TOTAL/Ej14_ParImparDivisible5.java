/*
Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.*/


public class Ej14_ParImparDivisible5 {
    public static void main(String[] args) {

        System.out.println("Por favor, introduce tu numero : ");
        int A = Integer.parseInt(System.console().readLine());

        if (A%5==0 && A%2==0) {
            System.out.println("Su numero es par y divisible entre 5 ");
        } 
        else if (A%5==0 && A%2!=0) {
            System.out.println("Su numero es impar y divisible entre 5");

        }
        else if ( A%2==0) {
            System.out.println("Su numero es par ");

        }
        else
        {
            System.out.println("Su numero es impar ");

        }

    }
}
