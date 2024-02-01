import java.util.Scanner;

public class NotasFactor {

    private static String askForData(String message, Scanner sc) {

        System.out.print(message);

        return sc.nextLine();

    }

    private static void Mostrar(String asignatura, String nota) {
        System.out.println("La nota de "+asignatura+ " es: " + nota);

    }

    public static void main(String[] args) {
        String asignaturas[] = { "Base de Datos", "Entorno de Desarrollo" };
        String[] notas = new String[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            notas[i] = askForData("Introduce la nota de " + asignaturas[i] + " :", sc);
        }
        for (int i = 0; i < asignaturas.length; i++) {
            Mostrar(asignaturas[i],notas[i]);
            
        }

    }
}
