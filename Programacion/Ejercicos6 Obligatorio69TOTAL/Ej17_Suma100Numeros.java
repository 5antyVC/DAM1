/*
Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).

 */
public class Ej17_Suma100Numeros {
    public static void main(String[] args) {

        int n = 0;
        System.out.print("Introduzca un numero positivo: ");
        n = Integer.parseInt(System.console().readLine());

        do {

            if (n < 0) {
                System.out.print("Porfavor Introduzca un numero positivo: ");
                n = Integer.parseInt(System.console().readLine());
            }

        } while (n < 0);

        int suma = 0;

        for (int i = n; i < n + 100; i++) {
            suma += i;
        }
        System.out.print("La suma de los 100 numeros a partir de " + n + " es " + suma);

    }

}