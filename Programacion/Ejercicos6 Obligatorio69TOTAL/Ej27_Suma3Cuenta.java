/*
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.


 */
public class Ej27_Suma3Cuenta {
    public static void main(String[] args) {
        
        System.out.print("Introduzca un numero: ");
        int n=Integer.parseInt(System.console().readLine());
        int cuenta=0 , suma=0;

        for (int i = 1; i < n; i++) {
            if (i%3==0) {
                System.out.print(i+", ");
                cuenta++;
                suma+=i;
            }

        }
    
        System.out.print("\nDesde 1 hasta "+n+" hay "+cuenta);
        System.out.println(" multiplos y la suma es "+suma);
    }
}
