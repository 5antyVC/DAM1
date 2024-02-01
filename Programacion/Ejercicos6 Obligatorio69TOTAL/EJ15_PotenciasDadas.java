/*
 * Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 21, 22, 23, 24 y 25.

 */
public class EJ15_PotenciasDadas {
    public static void main(String[] args) {
        int exp;
        int pot;
        System.out.print("Introduzca una base: ");
        int base = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca una exponente: ");
        int expFinal = Integer.parseInt(System.console().readLine());

        for (int i = 1; i <= expFinal; i++) {
            pot = 1;
            exp = i;

            for (int j = 0; j < exp; j++) {
                pot *= base;
            }
            System.out.println(base + "^" + i + "=" + pot);
        }

    }

}