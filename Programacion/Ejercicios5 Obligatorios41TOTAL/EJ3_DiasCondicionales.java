/*
Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
*/

public class EJ3_DiasCondicionales {
    public static void main(String[] args) {

        String linea;

        System.out.println("Por favor, introduce un numero: ");
        linea = System.console().readLine();
        int Num;
        Num = Integer.parseInt(linea);

        if (Num == 1) {
            System.out.println("Lunes");
        } else if (Num == 2) {
            System.out.println("Martes");
        }
        else if (Num == 3) {
            System.out.println("Miercoles");
        }
        else if (Num == 4) {
            System.out.println("Jueves");
        }
        else if (Num == 5) {
            System.out.println("Viernes");
        }
        else if (Num == 6) {
            System.out.println("Sabado");
        }else if (Num == 7) {
            System.out.println("Domingo");
        }else {
            System.out.println("No coincide con ningun dia");
        }

        

    }

}
