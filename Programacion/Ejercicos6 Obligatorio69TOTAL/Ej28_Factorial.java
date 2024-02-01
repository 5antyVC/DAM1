/*
Escribe un programa que calcule el factorial de un número entero leído por
teclado.
Ejemplo:
Por favor, introduzca un número entero: 6
6! = 720

 */
public class Ej28_Factorial {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero Positivo : ");
        int n=Integer.parseInt(System.console().readLine());
        while (n<=0) {
            System.out.print("Por favor, introduzca un número entero POSITIVO: ");

            n=Integer.parseInt(System.console().readLine());

        }
      
        int factorial=n;
        for (int i = 1; i <n; i++) {
            factorial*=i;
        }
        System.out.println(n+"! = "+factorial);

    }
}
