
/*
Una pastelería nos ha pedido realizar un programa que haga presupuestos de tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta: manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa 16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar además si el chocolate es negro o blanco; la primera opción vale 14 euros y la segunda 15. Por último se pregunta si se añade nata y si se personaliza con un nombre; la nata suma 2.50 y la escritura del nombre 2.75.
Ejemplo 1:
Elija un sabor (manzana, fresa o chocolate): chocolate
¿Qué tipo de chocolate quiere? (negro o blanco): negro
¿Quiere nata? (si o no): si
¿Quiere ponerle un nombre? (si o no): no
Tarta de chocolate negro: 14,00 €
Con nata: 2,50 €
Total: 16,50 €
Ejemplo 2:
Elija un sabor (manzana, fresa o chocolate): manzana
¿Quiere nata? (si o no): no
Sentencia condicional (if y switch) 52
¿Quiere ponerle un nombre? (si o no): si
Tarta de manzana: 18,00 €
Con nombre: 2,75 €
Total: 20,75 €
Ejemplo 3:
Elija un sabor (manzana, fresa o chocolate): fresa
¿Quiere nata? (si o no): si
¿Quiere ponerle un nombre? (si o no): si
Tarta de fresa: 16,00 €
Con nata: 2,50 €
Con nombre: 2,75 €
Total: 21,25 €
 * 
 */
import java.util.Scanner;

public class Ej27_PresupuestoTarta {
    public static void main(String[] args) {

        double precio = 0;
        Scanner s = new Scanner(System.in);
        String sabor, chocolate, nata, nombre;

        System.out.print("Elija un sabor (manzana, fresa o chocolate):");
        sabor = s.next();

        if (sabor.equals("manzana")) {
            precio = 18;
            System.out.println("Tarta de manzana: "+precio);
        } else if (sabor.equals("fresa")) {
            precio = 16;
            System.out.println("Tarta de fresa: "+precio);


        } else if (sabor.equals("chocolate")) {
            System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
            chocolate = s.next();
            if (chocolate.equals("negro")) {
                precio = 14;
                System.out.println("Tarta de chocolate negro: "+precio);

            } else if (chocolate.equals("blanco")) {
                precio = 15;
                System.out.println("Tarta de chocolate blanco: "+precio);

            }
        }

        System.out.print("¿Quiere ponerle un nata? (si o no):");
        nata = s.next();
        System.out.print("¿Quiere ponerle un nombre? (si o no):");
        nombre = s.next();


        if (nata.equals("si")) {
            precio += 2.5;
            System.out.println("Con nata: 2.5");
        } else if (nata.equals("no")) {
            precio += 0;

        }

        

        if (nombre.equals("si")) {
            precio += 2.75;
            System.out.println("Con nombre: 2.75");


        } else if (nombre.equals("no")) {
            precio += 0;

        }
        System.out.println("Total: "+precio);

    }

}