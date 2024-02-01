
/*/ 
Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos*/

public class Ej31_3NumerosMuestraMayor {
    public static void main(String[] args) {
        System.out.println("Por favor, introduce tu primer numero : ");
        int A = Integer.parseInt(System.console().readLine());
        System.out.println("Por favor, introduce tu segundo numero: ");
        int B = Integer.parseInt(System.console().readLine());
        System.out.println("Por favor, introduce tu tercer: ");
        int C = Integer.parseInt(System.console().readLine());

        if (A>=B &&  B>=C) {

            System.out.println(""+A);
        }
            else if (A>=C && A>=B) {
                System.out.println(""+A);

            }
            else if (B>=A && A>=C) {
                System.out.println(""+B);

            }
            else if (B>=C && C>=A) {
                System.out.println(""+B);

            }
            else if (C>=A && A>=B) {
                System.out.println(""+C);

            }
        
        else{
            System.out.println(""+C);

        }
    }

}
