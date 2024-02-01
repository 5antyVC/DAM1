public class Ej3PesetasEuros{
	
	public static void main (String[] args) {
		
		
		String linea;
		
		System.out.println("Por favor, introduzca la cantidad a convertir: ");
		linea=System.console().readLine();
		double Pesetas;
		Pesetas= Integer.parseInt(linea);
		
	double Euros, Conversion;
	Euros=0.006;
	Conversion=Euros*Pesetas;
	
	System.out.println(Pesetas+" pesetas"+(" son ")+Conversion+ " euros");
	

	}
}




