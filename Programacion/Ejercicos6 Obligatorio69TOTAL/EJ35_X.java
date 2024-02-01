/*
Realiza un programa que pinte una X hecha de asteriscos. El programa debe
pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
igual a 3, en caso contrario se debe mostrar un mensaje de error.
Ejemplo:
Por favor, introduzca la altura de la X: 5
* *
* *
*
* *
* *
 */
public class EJ35_X {
    public static void main(String[] args) {
    
        

      System.out.print("Introduzca la altura de la X: ");
      int h = Integer.parseInt(System.console().readLine());
        while (h<3 || h%2==0) {
            System.out.print("Introduzca una altura MAYOR o IGUAL a 3 o que sea IMPAR: ");
             h = Integer.parseInt(System.console().readLine());

        }

     
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
    System.out.println("  ");

    for (int i = 1; i < h; i++) {
        System.out.print("* ");
        for (int j = 2; j < h; j++) {
            System.out.print("  ");

        }
        System.out.println("*");
        

    
       
    }
  }
}