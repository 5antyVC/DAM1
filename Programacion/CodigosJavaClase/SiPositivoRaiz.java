
import java.util.Scanner;
import java.lang.Math;


public class SiPositivoRaiz{
	
	public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
    
        String linea;
		
		System.out.println("Por favor, introduce un numero: ");
		linea=System.console().readLine();
		int numero;
		numero= Integer.parseInt(linea);

        double raiz;


        if (numero>0 && numero!=0) {
            System.out.println("Su numero es positivo");
            raiz=Math.sqrt(numero);
            System.out.println("y su raiz es :"+raiz);
        }
        else if (numero<0 && numero!=0) {
            System.out.println("Su numero es negativo");

        }
            else{
                System.out.println("Su numero es 0");
            }
    }

}