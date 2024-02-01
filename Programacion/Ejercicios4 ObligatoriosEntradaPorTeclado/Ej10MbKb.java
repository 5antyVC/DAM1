
public class Ej10MbKb {
	
	public static void main (String[] args) {
		
		String linea;
		
		System.out.println("Por favor, introduzca la cantidad de Kb a convertir: ");
		linea=System.console().readLine();
		double Mb;
		Mb= Integer.parseInt(linea);
		
	double Kb;

	Kb=Mb*0.001;
	
	System.out.println(Mb+ " Megabytes son "+Kb+" Kilobytes");
	
		
		
	}
}

