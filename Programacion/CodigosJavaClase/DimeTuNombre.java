


public class DimeTuNombre {
	
	public static void main (String[] args) {
		
		
		
		String nombre, apellido, direccion, telefono;
		
		System.out.println("Por favor dime como te llamas: ");
		nombre=System.console().readLine();
		System.out.println("Hola "+nombre+", encantado de conocerte");
		
		System.out.println("Por favor dime como tu apellido: ");
		apellido=System.console().readLine();
		System.out.println( ""+apellido+", interesante");
		
		System.out.println("Por favor dime como tu Direccion: ");
		direccion=System.console().readLine();
		System.out.println("Vives en "+direccion);
		
		System.out.println("Por favor dime como tu telefono: ");
		telefono=System.console().readLine();
		System.out.println( ""+telefono+" es de los antiguos");
		
		
	}
}

