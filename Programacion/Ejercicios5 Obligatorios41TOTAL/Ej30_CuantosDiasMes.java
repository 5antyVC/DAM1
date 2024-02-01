
/*/ 
La aplicación debe pedir en consola un mes, por ejemplo “noviembre” y el programa debe decir cuantos días tiene ese mes.
*/
import java.util.Scanner;

public class Ej30_CuantosDiasMes {
    public static void main(String[] args) {

        int mes;
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca que día es (1-12): ");
        mes = s.nextInt();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Este mes tiene 31 dias");
                break;
            case 4, 6, 9, 11:
                System.out.println("Este mes tiene 30 dias");

                break;
            case 2:
             System.out.println("Este mes tiene 28 dias");

                break;
            default:
                break;
        }

    }

}
