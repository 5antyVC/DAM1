/*
Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10, imprimir en pantalla la leyenda "Todos los números son menores a diez".
*/

public class Ej37_SiMenores10 {
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


        
     if (A<10 && B<10 && C<10) {
       
        System.out.println("Todos los números son menores a diez");
     }
     else
     {
        System.out.println("No hace nada");
     }

    }

}