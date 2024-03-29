/*Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado.

 */
public class Ej12_Fibonacci {
    public static void main(String[] args) {

        System.out.print("Introduzca cuantos numeros quiere visualizar en la serie de Fibonacci: ");
        int Numero = Integer.parseInt(System.console().readLine());

        switch (Numero) {
            case 1:
                System.out.print("0");
                break;
            case 2:
                System.out.print("0 1");
                break;

            default:
                System.out.print("0 1");

                int f1 = 0;
                int f2 = 1;
                int temp;
                while (Numero > 2) {
                    temp = f1;
                    f1 = f2;
                    f2 = temp + f2;
                    System.out.print(" " + f2);
                    Numero--;
                }
                break;
        }

    }
}
