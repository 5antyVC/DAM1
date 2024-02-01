/*
Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma.

 */
public class Ej29_NumerosMenoresLeidos {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número: ");
        int a=Integer.parseInt(System.console().readLine());
        System.out.print("Por favor, introduzca otro: ");
        int b=Integer.parseInt(System.console().readLine());
        System.out.println("Los numeros enteros menores que "+a+" y que no son divisibles entre "+b+" son :");

            for (int i = 1; i < a; i++) {
                if (i%b==0) {
                    System.out.print(i+", ");
                }
            }
    }
}
