
import java.util.Scanner;

public class Ej12NotaMinimaSegundoExamenAprobar {
	
	public static void main (String[] args) {
		
 Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la nota del primer examen: ");
    double notaPrimerExamen = Double.parseDouble(s.nextLine());
    
    System.out.print("¿Qué nota quieres sacar en el trimestre? ");
    double notaDeseada = Double.parseDouble(s.nextLine());
    
    double notaSegundoExamen = (notaDeseada - (notaPrimerExamen * 0.4)) / 0.6;
    System.out.println("Para tener un " + notaDeseada + " en el trimestre necesitas sacar un " + notaSegundoExamen + " en el segundo examen.");
	}
}

