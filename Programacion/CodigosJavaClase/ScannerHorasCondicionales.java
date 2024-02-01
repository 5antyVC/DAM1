/*
 * 
Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o buenas noches según la hora. 
* Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
*/

import java.util.Scanner;
		
public class ScannerHorasCondicionales {
  public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
		
	System.out.print("Por favor, introduzca la hora: ");
    int numero = s.nextInt();
		
		
		if ((numero)>=(6) || (numero)<=12) {
			System.out.println("Buenos dias: ");}
			
			
		else if ((numero)>=13 || (numero)<=20) {
			System.out.println("buenas tardes: ");}
				
		else {
			
			System.out.println("buenas noches: ");}
			
}	

}
