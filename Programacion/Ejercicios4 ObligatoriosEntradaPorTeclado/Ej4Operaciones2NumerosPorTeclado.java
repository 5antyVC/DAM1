

public class Ej4Operaciones2NumerosPorTeclado {
	
	public static void main (String[] args) {
		
		
		String linea;
		
		System.out.println("Por favor, introduce un numero: ");
		linea=System.console().readLine();
		int primerNumero;
		primerNumero= Integer.parseInt(linea);
		
		
		System.out.println("Por favor, introduce  otro  numero: ");
		linea=System.console().readLine();
		int segundoNumero;
		segundoNumero= Integer.parseInt(linea);
		
		System.out.println("La Suma de sus numero es "+ (primerNumero+segundoNumero));
		System.out.println("La Resta de sus numero es "+ (primerNumero-segundoNumero));
		System.out.println("La Multiplicacion de sus numero es "+ (primerNumero*segundoNumero));
		System.out.println("La Division de sus numero es "+ (primerNumero/segundoNumero));
		
		
	}
}

