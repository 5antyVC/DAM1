
import java.util.Scanner;


public class  Promedio3NumerosDecimalesTeclado
 {
	
	public static void main (String[] args) {
	
	
	
	
	Scanner s= new Scanner(System.in);
	
	
	System.out.print("Introduce tu 1 asignatura: ");
	String a1 =s.nextLine();
	System.out.print("Introduce tu 1 nota: ");
	double n1=(s.nextDouble());
	System.out.print("La nota de "+a1+" es "+n1);
	
	System.out.print("Introduce tu 2 asignatura: ");
	String a2 =s.nextLine();
	System.out.print("Introduce tu 2 nota: ");
	double n2=(s.nextDouble());
	System.out.println("La nota de "+a2+" es "+n2);

	System.out.print("Introduce tu 3 asignatura: ");
	String a3 =s.nextLine();
	System.out.print("Introduce tu 3 nota: ");
	double n3=(s.nextDouble());
	System.out.println("La nota de "+a3+" es "+n3);

	System.out.print("Introduce tu 4 asignatura: ");
	String a4 =s.nextLine();
	System.out.print("Introduce tu 4 nota: ");
	double n4=(s.nextDouble());
	System.out.println("La nota de "+a4+" es "+n4);

	System.out.print("Introduce tu 5 asignatura: ");
	String a5 =s.nextLine();
	System.out.print("Introduce tu 5 nota: ");
	double n5=(s.nextDouble());
	System.out.println("La nota de "+a5+" es "+n5);

	
	double suma=n1+n2+n3+n4+n5;
	
	double promedio= suma/5; 
	
	System.out.println("Tu promedio es "+promedio);
	
}
}
