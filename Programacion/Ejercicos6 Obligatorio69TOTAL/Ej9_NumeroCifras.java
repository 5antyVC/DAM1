/*Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long). * 
 */
public class Ej9_NumeroCifras {
    public static void main(String[] args) {

        System.out.println("Por favor, introduce tu numero para ver cuantas cifras tiene (Maximo de 5 cifras): ");
        int Numero = Integer.parseInt(System.console().readLine());
        int Cifras = 1;

        while (Numero >= 10) {
            Cifras++;
            Numero /= 10;
        }
        if (Cifras > 5) {
            System.out.println("ERROR su numero contiene mas del número de cifras permitido");

        } else {
            System.out.println("Su numero contiene " + Cifras + " cifras");

        }
    }
}


