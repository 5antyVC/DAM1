
public class Ej11KbMb {
	
	public static void main (String[] args) {
		
		
		String linea;
		
		System.out.println("Por favor, introduzca la cantidad de Kb a convertir: ");
		linea=System.console().readLine();
		double Kb;
		Kb= Integer.parseInt(linea);
		
	double Mb;

	Mb=Kb*0.001;
	
	System.out.println(Kb+ " Kilobytes son "+Mb+" Megabytes");
		
		
	}
}

