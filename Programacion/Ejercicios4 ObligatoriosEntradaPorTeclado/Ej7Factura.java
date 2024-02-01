
public class Ej7Factura {
	
	public static void main (String[] args) {
		
		
		double preciocon, iva;
	
		String linea;
		
		System.out.println("Por favor, introduce el precio base : ");
		linea=System.console().readLine();
		double base;
		base= Integer.parseInt(linea);
	
	

	iva=base*0.21;
	preciocon=base+iva;
	

	System.out.println("Su precio sin IVA es "+base+" y con IVA es "+ preciocon);
		
	}
}

