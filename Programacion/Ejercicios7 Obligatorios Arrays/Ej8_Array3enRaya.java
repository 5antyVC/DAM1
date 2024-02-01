public class Ej8_Array3enRaya {
//Preguntar Pablo
    static String Player = "0";
    static String PC = "X";

    public static void main(String[] args) {

        String[][] tablero = new String[3][3];
        int i, j;
        int movimientos = 0;
        boolean TuGanas = false;
        boolean PCGana = false;
        String nombreFila = "cba";
        String coordenadas;

        // inicializa el tablero con 0 sino pone null
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                tablero[i][j] = " ";
            }
        }

        // juego /////////////////////////////////////////////////
        do {

            // pinta el tablero p
            System.out.println("  --------------- ");
            for (i = 0; i < 3; i++) {
                System.out.print(nombreFila.charAt(i));// Extremo Izquiero
                for (j = 0; j < 3; j++) {
                    System.out.print("| " + tablero[i][j] + " |");// Medio
                }
                System.out.println("|");// Extremo Derecho
                System.out.println("  ---------------");
            }
            System.out.println("     1   2   3\n");

            // pide las coordenadas
            System.out.print("Introduzca las coordenadas, por ejemplo b2: ");
            coordenadas = System.console().readLine();
            int fila = nombreFila.indexOf(coordenadas.charAt(0));
            int columna = coordenadas.charAt(1) - 1 - 48;
            tablero[fila][columna] = Player;
            movimientos++;

            // comprueba si gana el jugador
            TuGanas = ((tablero[0][0] == Player) && (tablero[0][1] == Player) && (tablero[0][2] == Player) ||
                    (tablero[1][0] == Player) && (tablero[1][1] == Player) && (tablero[1][2] == Player) ||
                    (tablero[2][0] == Player) && (tablero[2][1] == Player) && (tablero[2][2] == Player) ||
                    (tablero[0][0] == Player) && (tablero[1][0] == Player) && (tablero[2][0] == Player) ||
                    (tablero[0][1] == Player) && (tablero[1][1] == Player) && (tablero[2][1] == Player) ||
                    (tablero[0][2] == Player) && (tablero[1][2] == Player) && (tablero[2][2] == Player) ||
                    (tablero[0][0] == Player) && (tablero[1][1] == Player) && (tablero[2][2] == Player) ||
                    (tablero[0][2] == Player) && (tablero[1][1] == Player) && (tablero[2][0] == Player));

            if (!TuGanas && (movimientos < 9)) {
                // juega el PC
                do {
                    fila = (int) (Math.random() * 3);
                    columna = (int) (Math.random() * 3);
                } while (!tablero[fila][columna].equals(" "));

                tablero[fila][columna] = PC;
                movimientos++;
                // comprueba si gana el PC
                PCGana = ((tablero[0][0] == PC) && (tablero[0][1] == PC) && (tablero[0][2] == PC) ||
                        (tablero[1][0] == PC) && (tablero[1][1] == PC) && (tablero[1][2] == PC) ||
                        (tablero[2][0] == PC) && (tablero[2][1] == PC) && (tablero[2][2] == PC) ||
                        (tablero[0][0] == PC) && (tablero[1][0] == PC) && (tablero[2][0] == PC) ||
                        (tablero[0][1] == PC) && (tablero[1][1] == PC) && (tablero[2][1] == PC) ||
                        (tablero[0][2] == PC) && (tablero[1][2] == PC) && (tablero[2][2] == PC) ||
                        (tablero[0][0] == PC) && (tablero[1][1] == PC) && (tablero[2][2] == PC) ||
                        (tablero[0][2] == PC) && (tablero[1][1] == PC) && (tablero[2][0] == PC));
            }

        } while (!TuGanas && !PCGana && (movimientos < 9));

        // pinta el tablero
        System.out.println("  --------------- ");
            for (i = 0; i < 3; i++) {
                System.out.print(nombreFila.charAt(i));// Extremo Izquiero
                for (j = 0; j < 3; j++) {
                    System.out.print("| " + tablero[i][j] + " |");// Medio
                }
                System.out.println("|");// Extremo Derecho
                System.out.println("  ---------------");
            }
            System.out.println("     1   2   3\n");


        if (TuGanas) {
            System.out.println("Enhorabuena superaste a ChatGPT");
        } else if (PCGana) {
            System.out.println("Preparate para ser reemplazado por una IA");
        } else {
            System.out.println("Como has podido empatar Juan");
        }
    }
}