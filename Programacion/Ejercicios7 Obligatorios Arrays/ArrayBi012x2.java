public class ArrayBi012x2 {
    public static void main(String[] args) {
        //Declaramos array
        int[][] n= new int [3][2];
        //Asignamos valores
        n[0][0]=20;
        n[1][0]=67;
        n[1][1]=33;
        n[2][1]=7;
        
        //Fila
        System.out.println("           Columna 0 | Columna 1");

        for (int i = 0; i < 3; i++) {

            System.out.print("Fila "+i+" |");
            //Columna
            for (int j = 0; j < 2; j++) {

                System.out.printf("%10d ", n[i][j]);//pritf formato matriz
            }
            System.out.println();//Espacio separa columnas

        }

    }
}
