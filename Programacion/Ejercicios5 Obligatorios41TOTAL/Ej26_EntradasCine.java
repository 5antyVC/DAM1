/*Realiza un programa que calcule el precio de unas entradas de cine en función del número de personas y del día de la semana. El precio base de una entrada son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros. Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un grupo de 6 personas compran entradas, el precio total sería de 33 euros ya que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
1 individual que son 41 euros (33 + 8).
Ejemplo 1:
Venta de entradas CineCampa
Número de entradas: 4
Sentencia condicional (if y switch) 50
Día de la semana: martes
¿Tiene tarjeta CineCampa? (s/n): n
Aquí tiene sus entradas. Gracias por su compra.
Entradas individuales 4
Precio por entrada individual 8.00 €
Total 32.00 €
Descuento 0.00 €
A pagar 32.00 €
Ejemplo 2:
Venta de entradas CineCampa
Número de entradas: 4
Día de la semana: viernes
¿Tiene tarjeta CineCampa? (s/n): s
Aquí tiene sus entradas. Gracias por su compra.
Entradas individuales 4
Precio por entrada individual 8.00 €
Total 32.00 €
Descuento 3.20 €
A pagar 28.80 €
Ejemplo 3:
Venta de entradas CineCampa
Número de entradas: 4
Día de la semana: jueves
¿Tiene tarjeta CineCampa? (s/n): n
Aquí tiene sus entradas. Gracias por su compra.
Entradas de parejas 2
Precio por entrada de pareja 11.00 €
Total 22.00 €
Descuento 0.00 €
A pagar 22.00 €
Ejemplo 4:
Venta de entradas CineCampa
Número de entradas: 5
Día de la semana: jueves
¿Tiene tarjeta CineCampa? (s/n): s
Aquí tiene sus entradas. Gracias por su compra.
Entradas parejas 2
Sentencia condicional (if y switch) 51
Precio por entrada de pareja 11.00 €
Entradas individuales 1
Precio por entrada individual 8.00 €
Total 30.00 €
Descuento 3.00 €
A pagar 27.00 €
Ejemplo 5:
Venta de entradas CineCampa
Número de entradas: 5
Día de la semana: miercoles
¿Tiene tarjeta CineCampa? (s/n): s
Aquí tiene sus entradas. Gracias por su compra.
Entradas individuales 5
Precio por entrada individual 5.00 €
Total 25.00 €
Descuento 2.50 €
A pagar 22.50 €
 * 
 */

import java.util.Scanner;

public class Ej26_EntradasCine {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int Entradas = 0; 
        double Precio = 0, Total=0, Descuento=0;
        String Dia, Tarjeta;
        System.out.println("Venta de entradas CineCampa");

        System.out.print("Numero de entradas: ");
        Entradas = s.nextInt();

        System.out.print("Dia de la semana(Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo):");
        Dia = s.next();

        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        Tarjeta = s.next();

        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");

        System.out.println("Entradas individuales: " + Entradas);

        if (Dia.equals("Miercoles")) {
            Precio = 5;
        } else {
            Precio = 8;
        }
        
        System.out.println("Precio por entrada individual: "+Precio);
        Total=Precio*Entradas;
        System.out.println("Total: "+Total);

        if (Tarjeta.equals("s")) {
            Descuento=Total*0.1;
            System.out.println("Descuento: "+Descuento);
        }
        else if (Tarjeta.equals("n")) {
            Descuento=0;

            System.out.println("Descuento: "+Descuento);

        }
        System.out.println("A pagar :"+(Total-Descuento));
    }
}