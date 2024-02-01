/*La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y nos ha pedido hacer un configurador que calcule el precio según el alto y el ancho. El precio base de una bandera es de un céntimo de euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío son 3.25 €. El IVA ya está incluido en todas las tarifas.
Ejemplo 1:
Introduzca la altura de la bandera en cm: 20
Ahora introduzca la anchura: 35
¿Quiere escudo bordado? (s/n): n
Gracias. Aquí tiene el desglose de su compra.
Bandera de 700 cm2: 7,00 €
Sin escudo: 0,00 €
Gastos de envío: 3,25 €
Total: 10,25 €
Ejemplo 2:
Introduzca la altura de la bandera en cm: 10
Ahora introduzca la anchura: 15
¿Quiere escudo bordado? (s/n): s
Gracias. Aquí tiene el desglose de su compra.
Bandera de 150 cm2: 1,50 €
Con escudo: 2,50 €
Gastos de envío: 3,25 €
Total: 7,25 €
 * 
 */

import java.util.Scanner;

public class Ej25_BanderasEspaña {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int altura, anchura;
        double precio=0, escudoprecio,totalcm=0,total=0;
        String escudo;
        System.out.print("Introduzca la altura de la bandera en cm:");
        altura = s.nextInt();
        System.out.print("Introduzca la anchura de la bandera en cm:");
        anchura = s.nextInt();
        System.out.print("Quiere escudo bordado? (s/n):");
        escudo=s.next();

        System.out.println("Gracias. Aquí tiene el desglose de su compra.");
        System.out.println("-------------------------------------------");

        totalcm=altura*anchura;

        precio=totalcm/100;

        System.out.println("Bandera de "+totalcm+" cm2: "+precio+" euros");

        if (escudo.equals("s")) {
            escudoprecio=2.5;
            System.out.println("Con Escudo: "+escudoprecio+" euros");
            precio+=2.5;
        }
        else{
            escudoprecio=0;

            System.out.println("Sin  Escudo: "+escudoprecio+" euros");
        }
       
        System.out.println("Gastos de envio: 3.25 euros");
        total=precio+3.25;
        System.out.println("Total: "+total+" euros");
    }
}
