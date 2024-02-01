public class Ej2EurosPesetas{
	
	public static void main (String[] args) {
		
		String linea;
		
		System.out.println("Por favor, introduzca la cantidad a convertir: ");
		linea=System.console().readLine();
		double Euros;
		Euros= Integer.parseInt(linea);
		
	double Pesetas;

	Pesetas=Euros*166;
	
	System.out.println(Euros+ " euros son "+Pesetas+" pesetas");
	
	

	}
}



