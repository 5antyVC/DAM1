/*
 * Realiza un programa que pida un número por teclado y que luego muestre ese
número al revés.


 */
public class Ej25_NumeroReves {
    public static void main(String[] args) {
        
        System.out.print("Introduzca un numero para mostrarlo al revez:");
        int n=Integer.parseInt(System.console().readLine());

        int numero=n;
        int revez=0;

        while (numero>0) {
            revez=(revez*10)+(numero%10);
            numero/=10;
        }

        System.out.print("Su numero era " + n);
        System.out.println(" y al revez es " + revez);
    }
}
