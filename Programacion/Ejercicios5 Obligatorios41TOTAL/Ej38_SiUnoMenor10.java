/*
Se ingresan por teclado tres números, si al menos uno de los valores ingresados es menor a 10, imprimir en pantalla la leyenda "Alguno de los números es menor a diez".
*/

public class Ej38_SiUnoMenor10 {
    public static void main(String[] args) {


        System.out.println("Por favor, introduzca su primer numero : ");
        int B;
        B = Integer.parseInt(System.console().readLine());
        System.out.println("Por favor, introduzca su segundp numero: ");
        int A;
        A = Integer.parseInt(System.console().readLine());
        System.out.println("Por favor, introduzca su tercer numero: ");
        int C;
        C = Integer.parseInt(System.console().readLine());


        
     if (A<10 || B<10 || C<10) {
       
        System.out.println("Alguno de los números es menor a diez");
     }
     else
     {
        System.out.println("No hace nada");
     }

    }

}