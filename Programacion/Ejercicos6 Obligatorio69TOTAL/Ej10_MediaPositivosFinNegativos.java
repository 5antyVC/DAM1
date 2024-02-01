/*Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.

 */
public class Ej10_MediaPositivosFinNegativos {
    public static void main(String[] args) {

        int Numero=0, suma=0, numeros=0;
        System.out.print("Introduzca todos los numeros que quiera para hacer una media, el programa para cuando meta uno negativo: ");

        while (Numero>=0) {
            Numero = Integer.parseInt(System.console().readLine());
            numeros++;
            suma+=Numero;
        }
        
        System.out.print("La suma de los numeros positivos es " );
        System.out.println("Y su media es  "+ (suma-Numero/(numeros-1)));

    }
}
