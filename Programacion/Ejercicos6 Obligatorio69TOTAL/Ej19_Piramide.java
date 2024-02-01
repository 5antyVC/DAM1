/*
 *Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.


 */
public class Ej19_Piramide {
    public static void main(String[] args) {

        System.out.print("Introduzca la altura de la piramide: ");
        int h = Integer.parseInt(System.console().readLine());
        
        System.out.print("Introduzca el relleno: ");
        String r = System.console().readLine();

        int base=1;
        int linea=1;
        int espacios=h-1;

        while (base<=h) {
            
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= linea; i++) {
                System.out.print(r);


            }

            System.out.println();

            base++;
            espacios--;
            linea+=2;
        }


    }
}