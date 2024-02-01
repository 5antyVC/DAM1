import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] notas = new double[2];
        System.out.println("Introduce la nota de la asignatura Base de Datos: ");
        notas[0] = input.nextDouble();
        System.out.println("Introduce la nota de la asignatura Entorno de Desarrollo: ");
        notas[1] = input.nextDouble();
        System.out.println("La nota de Base de Datos es " + notas[0]);
        System.out.println("La nota de Entorno de Desarrolo es " + notas[1]);
        input.close();
    }

}