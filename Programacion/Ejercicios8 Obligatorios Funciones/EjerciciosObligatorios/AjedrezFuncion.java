import java.util.Scanner;

public class AjedrezFuncion {
    Scanner sc = new Scanner(System.in);
    String[][] a = new String[8][8];
    int op = 0, op1 = 0, k = 0, p = 0;


    public static void main(String[] args) {

        AjedrezFuncion Ajedrez = new AjedrezFuncion();
        Ajedrez.MOSTRAR();

        // PREGUNTAR
        Ajedrez.PREGUNTAR();

        // SUBSTITUIR
        Ajedrez.SUBSTITUIR();
        System.out.println("-----------------------------------------------------------------------");


        // DIAGONALS
        Ajedrez.DIAGONALS();


    }



    public void MOSTRAR() {


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
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf(a[i][j] + "       ");
            }
            System.out.println("");
        }
    }

    

    public void PREGUNTAR() {

        System.out.printf("En que  fila vas a poner el alfil (1-8): ");
        op = sc.nextInt();
        System.out.printf("En que columna vas a poner el alfil: (1-8)");
        op1 = sc.nextInt();

        op = op - 1;
        op1 = op1 - 1;
    }

    public void SUBSTITUIR() {

        a[op][op1] = "A";
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf(a[i][j] + "       ");
            }
            System.out.println("");
        }

    }

    public void DIAGONALS() {
        for (int i = 1; i < 9; i++) {
            int op = 0, op1 = 0, k = 0, p = 0;
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
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf(a[i][j] + "       ");
            }
            System.out.println("");
        }
    }
}
