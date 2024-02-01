/*Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 */
public class EJ8_TablaMultiplicar {
    public static void main(String[] args) {
        
    System.out.print("Introduzca un número y le mostraré su tabla de multiplicar: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    for (int i = 0; i <= 12; i++) {
        System.out.printf("%d x %2d = %3d\n", numeroIntroducido, i, numeroIntroducido * i);
    }


    }
}
