public class SiAMayorBoBMayorAResta{
	
	public static void main (String[] args) {

    
        String linea;
		
		System.out.println("Por favor, introduce el numero A: ");
		linea=System.console().readLine();
		int A;
		A= Integer.parseInt(linea);
		
		System.out.println("Por favor, introduce el  numero B: ");
		linea=System.console().readLine();
		int B;
		B= Integer.parseInt(linea);

        if (A>B) {
            System.out.println("Como A > B hacemos A-B = "+(A-B));
        }
        else{

            System.out.println("Como B > A hacemos B-A = "+(B-A));

        }

       
    }

}