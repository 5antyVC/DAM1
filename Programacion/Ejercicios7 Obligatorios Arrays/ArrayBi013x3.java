public class ArrayBi013x3 {
    public static void main(String[] args) {
        //Declaramos array
        int[][] n= new int [3][3];
        //Asignamos valores
        n[0][0]=20;
        n[1][0]=67;
        n[1][1]=33;
        n[2][1]=7;
        n[2][2]=90;
        //Fila
        for (int i = 0; i < 3; i++) {

            //Columna
            for (int j = 0; j < 3; j++) {
                System.out.printf("%10d ", n[i][j]);//pritf formato matriz
            }
            System.out.println();//Espacio separa columnas

        }

    }
}
