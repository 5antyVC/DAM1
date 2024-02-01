/*
Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
1
121
12321
1234321


 */
public class Ej24_PiramideNumeros {
    public static void main(String[] args) {

       
    

        System.out.print("Introduzca la altura de la piramide: ");
        int h = Integer.parseInt(System.console().readLine());
        int espacios=h-1;
        int altura=1;
        while (altura<=h) {
            
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <altura; i++) {
                System.out.print(i);


            }
            for (int i = altura; i >0; i--) {
                System.out.print(i);

            }
            System.out.println();
            altura++;
            espacios--;
            
        }
    }
}