
/*
Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las dos notas que ha sacado el alumno en los dos primeros controles. Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
la nota media anterior.
*/
import java.util.Scanner;

public class Ej21_Media2Notas {
    public static void main(String[] args) {

        System.out.println("Por favor, introduce tu primera nota : ");
        double A = Integer.parseInt(System.console().readLine());

        System.out.println("Por favor, introduce tu segunda nota : ");
        double B = Integer.parseInt(System.console().readLine());

        System.out.println("Su primera nota : " + A);
        System.out.println("Su segunda nota : " + B);

        double media = (A + B) / 2;

        if (media >= 5) {
            System.out.println("Su nota de programacion es " + media);
        } else {
            System.out.println("Cual ha sido el resultado de la recuperacion (apto/no apto) ");
            Scanner s = new Scanner(System.in);
            String apto = s.next();

            if (apto.equals("apto") ) {
                System.out.println("Su nota de programacion es 5");

            } else {
                System.out.println("Su nota de programacion es " + media);

            }
        }
    }

}
