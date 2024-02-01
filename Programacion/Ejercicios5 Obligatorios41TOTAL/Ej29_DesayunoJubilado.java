
/*Realiza un programa que calcule el precio de un desayuno. El programa preguntará primero qué ha tomado el usuario de comer: palmera, donut o pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el programa debe preguntar además si era con aceite o con tortilla; el primero
vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o café a 1’50 y 1’20 respectivamente.
Sentencia condicional (if y switch) 53
Ejemplo 1:
¿Qué ha tomado de comer? (palmera, donut o pitufo): palmera
¿Qué ha tomado de beber? (zumo o café): café
Palmera: 1,40 €
Café: 1,20 €
Total desayuno: 2,60 €
Ejemplo 2:
¿Qué ha tomado de comer? (palmera, donut o pitufo): pitufo
¿Con qué se ha tomado el pitufo? (aceite o tortilla): tortilla
¿Qué ha tomado de beber? (zumo o café): zumo
Pitufo con tortilla: 1,60 €
Zumo: 1,50 €
Total desayuno: 3,10 €
 * 
 */
import java.util.Scanner;

public class Ej29_DesayunoJubilado {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double precio = 0;
        String comer, beber, pitufo;
        System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
        comer = s.next();

        System.out.print("¿Qué ha tomado de beber? (zumo o cafe):");
        beber = s.next();

        if (comer.equals("pitufo")) {
            System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
            pitufo = s.next();

            if (pitufo.equals("aceite")) {
                precio += 1.2;
                System.out.println("Pitufo con aceite: 1.2");
            } else if (pitufo.equals("tortilla")) {
                precio += 1.6;
                System.out.println("Pitufo con tortilla: 1.6" );

            }
        } else if (comer.equals("palmera")) {
            precio += 1.4;
            System.out.println("Palmera: 1.4" );
        } else if (comer.equals("donut")) {
            precio += 1;
            System.out.println("Donut: 1" );
        }

        if (beber.equals("zumo")) {
            precio += 1.5;
            System.out.println("Zumo: 1.5" );

        } else if (beber.equals("cafe")) {
            precio += 1.2;
            System.out.println("Cafe: 1.2" );
        }
        System.out.println("Total del Desayuno Jubilado: "+precio);
    }
}