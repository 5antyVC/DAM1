
public class  LeeNumeros {
	
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
		
		System.out.println("Por favor, introduce  el ultimo numero: ");
		linea=System.console().readLine();
		int TercerNumero;
		TercerNumero= Integer.parseInt(linea);
		
		
		System.out.print("El primer numero introducido es "+ primerNumero);
		System.out.print(" y el segundo es "+segundoNumero);
		System.out.println(" y por ultimo el tercero es "+TercerNumero);

		
		int suma, resta, multi, div;
		suma=primerNumero+segundoNumero+TercerNumero;
		System.out.println(" La suma de todo es "+suma);

		resta=primerNumero-segundoNumero-TercerNumero;
		System.out.println(" La suma de todo es "+resta);

		multi=primerNumero*segundoNumero*TercerNumero;
		System.out.println(" La multi de todo es "+multi);

		div=(primerNumero/segundoNumero)/TercerNumero;
		System.out.println(" La div  de todo es "+div);

		
	}
}

