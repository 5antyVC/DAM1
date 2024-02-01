import java.lang.Math;
public class Ej9VolumenCono {
	
	public static void main (String[] args) {
		
		
		double pi= 3.14159265359;
		
		
		String linea;
		
		System.out.println("Por favor, introduce la altura de su cono en cm : ");
		linea=System.console().readLine();
		double h;
		h= Integer.parseInt(linea);
		System.out.println("Por favor, introduce el radio de su cono en cm: ");
		linea=System.console().readLine();
		double r;
		r= Integer.parseInt(linea);
		
		double radio = Math.pow(r,2);
		System.out.println("El volumen de su cono es :"+ (0.33333*pi*radio*h));
		
		
		
	}
}

