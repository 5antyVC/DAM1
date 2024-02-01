import java.util.Scanner;
public class Ej7_ArrayAjedrez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0, op1 = 0, k = 0, p = 0;
        String[][] a = new String[8][8];
        // BLANC NEGRE
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    a[i][j] = "B";
                } else if (i % 2 != 0 && j % 2 == 0) {
                    a[i][j] = "B";
                } else {
                    a[i][j] = "N";
                }

            }
        }

        // MOSTRAR
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf(a[i][j] + "       ");
            }
            System.out.println("");
        }

        // PREGUNTAR
        System.out.printf("En que  fila vas a poner el alfil (1-8): ");
        op = sc.nextInt();
        System.out.printf("En que columna vas a poner el alfil: (1-8)");
        op1 = sc.nextInt();

        op = op - 1;
        op1 = op1 - 1;

        // SUBSTITUIR
        a[op][op1] = "A";

        // MOSTRAR
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf(a[i][j] + "       ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        // DIAGONALS
        for (int i = 1; i < 9; i++) {

            if (op + i < 8 && op1 + i < 8) {
                a[op + i][op1 + i] = "*";
            }

            if (op - i >= 0 && op1 - i >= 0) {
                a[op - i][op1 - i] = "*";
            }

            if (op + i < 8 && op1 - i >= 0) {
                a[op + i][op1 - i] = "*";
            }

            if (op - i >= 0 && op1 + i < 8) {
                a[op - i][op1 + i] = "*";
            }

        }

        // MOSTRAR
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf(a[i][j] + "       ");
            }
            System.out.println("");
        }
    }
}