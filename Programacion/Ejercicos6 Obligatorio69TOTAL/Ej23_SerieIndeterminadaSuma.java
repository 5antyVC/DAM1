/*
 * Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.

 */
public class Ej23_SerieIndeterminadaSuma {
    public static void main(String[] args) {
        

        System.out.println("Por favor vaya introduciendo numeros:");
        int cuantos=0, suma=0;

        
        do {
            int n=Integer.parseInt(System.console().readLine());
            suma+=n;
            cuantos++;
        } while (suma<=10000);
        System.out.println("Ha introducido "+cuantos+" numeros");
        System.out.print("La media es: ");
        System.out.println(suma/cuantos);

    }
}
