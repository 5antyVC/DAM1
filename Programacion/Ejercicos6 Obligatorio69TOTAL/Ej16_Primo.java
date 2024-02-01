/*
Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.

 */
public class Ej16_Primo {
    public static void main(String[] args) {
       
        System.out.print("Introduzca un numero: ");
        int n = Integer.parseInt(System.console().readLine());
        
        boolean primo=true;

        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                primo=false;
            }
        }


        if (primo==true) {
            System.out.print("Su numero "+n +" es primo");
        }
        else
        {
            System.out.print("Su numero "+n +" no es primo");
 
        }
    }

}