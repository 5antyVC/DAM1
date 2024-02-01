import java.util.Scanner;

public class Excepciones {
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);

        System.out.println("Este programa calcula la media de 2 numeros");

        
        try {
            System.out.print("Introduzca el primero: ");
            double n1= s.nextDouble();
            System.out.print("Introduzca el segundo: ");
            double n2= s.nextDouble();
            System.out.println("La media es "+(n1+n2)/2);
        } catch (Exception e) {
            System.out.println("No se puede calcular la media");
            System.out.println("Los datos introducidos no son correctos");
           
        }
        finally{//ocpional
            System.out.println("Gracias por utilizarme");
        }
    }
}
