/*
 * Generacion de numeros aleatorios x10
 */

public class  GeneracionNumerosRandom20{
	
	public static void main (String[] args) {


        System.out.println("20 numeros aleatorios entre 0 u 10: ");
        System.out.println("sin llegar a 10 (con decimales): ");

        for (int i = 1; i <= 20; i++) {
            System.out.println(Math.random()*10+" ");
        }

    }
}
