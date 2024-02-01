/*
Se ingresan tres valores por teclado, si todos son iguales se imprime la suma del primero con el segundo y a este resultado se lo multiplica por el tercero.*/
public class Ej36_Suma2Multi3 {
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


        
     if (B==A && B==C) {
        int suma=B+A;
        int multiplica =suma*C;
        System.out.println("La suma de "+B+"+"+A+"="+suma+" y (B+A)*C="+multiplica);
     }
     else
     {
        System.out.println("No hace nada");
     }

    }

}