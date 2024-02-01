/*Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia.
 */
public class Ej14_CalculoPotencia {
    public static void main(String[] args) {

        System.out.print("Introduzca una base: ");
        int base = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca una exponente: ");
        int exp = Integer.parseInt(System.console().readLine());

        int pot = 1;

        if (exp == 0) {
            pot = 1;
        } else if (exp > 0) {
            for (int i = 0; i < exp; i++) {
                pot *= base;
            }
        } else {
            for (int i = 0; i < exp; i++) {
                pot *= base;
            }
            pot = (1 / pot);

        }
        System.out.println(base + "^" + exp + "=" + pot);
    }
}
