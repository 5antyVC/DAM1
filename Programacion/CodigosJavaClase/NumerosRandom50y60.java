/*
 * Generacion de 20 numeros aleatorios sin decimales entre 50y60
 */

public class  NumerosRandom50y60{
	
	public static void main (String[] args) {


        System.out.println("20 numeros aleatorios entre 50 y 60(sin decimales): ");

        for (int i = 1; i <= 20; i++) {
            System.out.println(((int)(Math.random()*11)+50)+" ");
        }
    }
}
