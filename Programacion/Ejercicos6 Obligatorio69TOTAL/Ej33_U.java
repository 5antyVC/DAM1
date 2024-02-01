/*
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.
Ejemplo 1:
Introduzca la altura de la U: 5
* *
* *
* *
* *
* * *
Ejemplo 2:
Introduzca la altura de la U: 4
* *
* *
* *
* *

 */
public class Ej33_U {
    public static void main(String[] args) {
  
      System.out.print("Introduzca la altura de la U: ");
      int h = Integer.parseInt(System.console().readLine());
  

        for (int i = 1; i < h; i++) {
            System.out.print("* ");
            for (int j = 2; j < h; j++) {
                System.out.print("  ");

            }
            System.out.println("*");

        }

        System.out.print("  ");

        for (int i = 2; i < h; i++) {
            System.out.print("* ");
        }
    }
  }