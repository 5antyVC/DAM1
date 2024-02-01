
public class Ej5AreaRectangulo{
	
	public static void main (String[] args) {
		
		String linea;
		
		System.out.println("Por favor, introduce la base en cm: ");
		linea=System.console().readLine();
		int Base;
		Base= Integer.parseInt(linea);
		
		
		System.out.println("Por favor, introduce  la altutra en cm: ");
		linea=System.console().readLine();
		int Altura;
		Altura= Integer.parseInt(linea);
		
		
		System.out.println("El Area de su rectangulo es "+ (Base*Altura)+"cm");
		
		
		
		
	}
}

