public class Ej6_ArrayTabla {
    public static void main(String[] args) {

        int[][] tabla = new int[3][6];
        // Asignamos valores de la primera fila 0
        tabla[0][0] = 0;
        tabla[0][1] = 30;
        tabla[0][2] = 2;
        tabla[0][5] = 90;
        // Asignamos valores de la primera fila 1
        tabla[1][0] = 75;
        tabla[1][4] = 0;
        // Asignamos valores de la primera fila 2
        tabla[2][2] = -2;
        tabla[2][3] = 9;
        tabla[2][5] = 11;
        System.out.print("Array num");

        for (int i = 0; i < 6; i++) {
            System.out.print("   Columna"+i);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print("Fila " + i);
            // Columna
            for (int j = 0; j < 6; j++) {
                System.out.printf("%10d ", tabla[i][j]);// pritf formato matriz
            }
            System.out.println();// Espacio separa columnas

        }
    }
}
