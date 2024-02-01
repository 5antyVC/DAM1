/*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.


 */
public class Ej11_CuadradosyCubos {
    public static void main(String[] args) {

        System.out.print("Introduzca un numero ");
        int Numero = Integer.parseInt(System.console().readLine());

       System.out.println("     n    -   n^2     -   n^3");
       System.out.println("----------------------------------");
        for (int i = Numero; i < Numero+5; i++) {
            System.out.printf("%5d  %8d  %9d\n", i, i*i,i*i*i);

        }

        
    }
}

