public class ArrayCaracterFila {
    public static void main(String[] args) {
        String[][] n = { { "Programación ", "10" },
                         { "Lenguaje de marcas ", "8" },
                         { "Base de datos ", "9" } };
        int i, j;

        for (i = 0; i < 3; i++) {

            for (j = 0; j < 2; j++) {
                System.out.print(n[i][j]);

            }
            System.out.println();

        }

    }
}
