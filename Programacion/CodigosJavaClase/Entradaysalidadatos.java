
import java.io.Console;
public class Entradaysalidadatos {
	
	public static void main (String[] args) {
		
		Console c=System.console();
		if(c==null)
		{
			System.err.println("No hay consola");
			
			}
		else{
			System.out.println("Introduce su nombre: ");
			String nombre=c.readLine();
			System.out.println("Hola ,"+nombre);
			System.out.println("Introduzca su contraseña: ");
			
			String password = String.valueOf(c.readPassword());
			System.out.println("Su password es: "+ password);
		}	
		
	}
}

