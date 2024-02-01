/*
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en
7.

 */
public class Ej18_IntervaloNumeros {
    public static void main(String[] args) {

        System.out.print("Introduzca un numero: ");
        int n1 = Integer.parseInt(System.console().readLine());
        
        System.out.print("Introduzca otro distinto al anterior: ");
        int n2 = Integer.parseInt(System.console().readLine());

        if (n1==n2) {
            do {
                System.out.print("Por favor,Introduzca otro distinto al anterior: ");
                 n2 = Integer.parseInt(System.console().readLine());
            } while (n1 == n2);
        }
      


        if (n1>n2) {
            int temp=n1;
            n1=n2;
            n2=temp;
        }

        for (int i = n1; i < n2; i+=7) {
            System.out.print(i+" ");
        }

    }
}