
public class Ej8SalarioSemanal {
	
	public static void main (String[] args) {
		
		
	
		String linea;
		
		System.out.println("Por favor, introduce sus horas trabajadas a la semana : ");
		linea=System.console().readLine();
		double horas;
		horas= Integer.parseInt(linea);
		
		System.out.println("Su salario semanal contando con 12 euros la hora es :"+ horas*12);
		
		
	}
}

