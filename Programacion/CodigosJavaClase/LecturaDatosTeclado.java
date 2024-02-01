
import java.util.Scanner;


public class  LecturaDatosTeclado {
	
	public static void main (String[] args) {
	
	
	
	
	Scanner s= new Scanner(System.in);
	
	
	System.out.print("Introduce tu nombre: ");
	String nombre =s.nextLine();
	
	System.out.print("Introduce tu apellido: ");
	String apellido =s.nextLine();
	
	System.out.print("Introduce tu direccion: ");
	String direccion=s.nextLine();
	
	System.out.print("Introduce tu numero: ");
	String numero =s.nextLine();
	
	System.out.print("Introduce tu edad: ");
	int edad=Integer.parseInt(s.nextLine());
	
	System.out.println("Tu nombre es "+nombre+" "+apellido+" y su edad es "+edad+" y tu direccion es "+direccion+" y tu numero es "+ numero );
	
}
}
