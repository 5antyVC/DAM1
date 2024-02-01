public class Ej1Pide2NumyMult{
	
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
		
		
		System.out.println("La multiplicacion de sus numero es "+ (primerNumero*segundoNumero));
		
		
	}
}

