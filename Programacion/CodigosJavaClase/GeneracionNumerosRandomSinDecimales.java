/*
 * Generacion de numeros aleatorios sin decimales
 */

public class  GeneracionNumerosRandomSinDecimales{
	
	public static void main (String[] args) {


        System.out.println("20 numeros aleatorios entre 0 y 9(sin decimales): ");

        for (int i = 1; i <= 20; i++) {
            System.out.println((int)(Math.random()*10)+" ");
        }
    }
}
